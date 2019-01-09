/*
 * Copyright ©2018. The Regents of the University of California (Regents). All Rights
 * Reserved. Permission to use, copy, modify, and distribute this software and its documentation
 * for educational, research, and not-for-profit purposes, without fee and without a signed
 * licensing agreement, is hereby granted, provided that the above copyright notice, this paragraph
 * and the following two paragraphs appear in all copies, modifications, and distributions. Contact
 * The Office of Technology Licensing, UC Berkeley, 2150 Shattuck Avenue, Suite 510, Berkeley, CA
 * 94720-1620, (510) 643-7201, otl@berkeley.edu, http://ipira.berkeley.edu/industry-info for
 * commercial licensing opportunities.
 *
 * IN NO EVENT SHALL REGENTS BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT, SPECIAL,
 * INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS, ARISING OUT OF THE
 * USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF REGENTS HAS BEEN ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 *
 * REGENTS SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE
 * SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY, PROVIDED HEREUNDER IS
 * PROVIDED "AS IS". REGENTS HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT,
 * UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 */

package edu.berkeley.path.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by shivanibongoni on 9/7/17.
 */
public class JsonUtil {

    // TODO move to slf4j
    // (although, this framework shouldn't be polluting log.error anyway!  It should just throw the exception, maaaaaybe using log.debug)
    //private static final Logger LOG = LogManager.getLogger(JsonUtil.class);

    private static final JsonUtil DEFAULT_SERIALIZER;

    static {
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        mapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, true);

        mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        DEFAULT_SERIALIZER = new JsonUtil(mapper);
    }

    public static JsonUtil serializer() {
        return DEFAULT_SERIALIZER;
    }

    private ObjectMapper mapper;
    private final ObjectWriter writer;
    private final ObjectWriter prettyWriter;


    private JsonUtil(ObjectMapper mapper) {
        this.mapper = mapper();
        this.writer = mapper.writer();
        this.prettyWriter = mapper.writerWithDefaultPrettyPrinter();
    }

    public ObjectMapper mapper() {
        return new ObjectMapper();
    }

    public ObjectWriter writer() {
        return writer;
    }

    public ObjectWriter prettyWriter() {
        return prettyWriter;
    }

    public <T> T fromJson(byte[] bytes, TypeReference<T> typeRef) {
        try {
            return mapper.readValue(bytes, typeRef);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public <T> T fromJson(String json, JavaType obj) {
        try {
            return mapper.readValue(json, obj);
        } catch (Exception e) {
            //LOG.error("Exception parsing json string" + e);
            throw new JsonException(e);
        }
    }

    public <T> T fromJson(String json, TypeReference<T> typeRef) {
        try {
            return mapper.readValue(json, typeRef);
        } catch (Exception e) {
            //LOG.error("Exception parsing json string : " + e);
            throw new JsonException(e);
        }
    }

    public <T> T fromNode(JsonNode node, TypeReference<T> typeRef) {
        try {
            return mapper.readValue(node.toString(), typeRef);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public <T> T fromObject(Object obj, TypeReference<T> typeRef) {
        try {
            return mapper.readValue(toString(obj), typeRef);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public <T> T fromInputStream(InputStream is, TypeReference<T> typeRef) {
        try {
            return mapper.readValue(is, typeRef);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public String toString(Object obj) {
        try {
            return writer.writeValueAsString(obj);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public String toPrettyString(Object obj) {
        try {
            return prettyWriter.writeValueAsString(obj);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public byte[] toByteArray(Object obj) {
        try {
            return prettyWriter.writeValueAsBytes(obj);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public Map<String, Object> mapFromJson(byte[] bytes) {
        try {
            return mapper.readValue(bytes, new TypeReference<Map<String, Object>>() {
            });
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public Map<String, Object> mapFromJson(String json) {
        try {
            return mapper.readValue(json, new TypeReference<Map<String, Object>>() {
            });
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public JsonNode nodeFromJson(String json) {
        try {
            return mapper.readTree(json);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public JsonNode nodeFromObject(Object obj) {
        try {
            return mapper.readTree(toString(obj));
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public static class JsonException extends RuntimeException {
        private JsonException(Exception ex) {
            super(ex);
        }
    }


    public static boolean checkJsonEqual(String inputJson, String resultJson) {
        Map<String, Object> m1 = null;
        Map<String, Object> m2 = null;
        try {
            m1 = (Map<String, Object>) (serializer().mapper.readValue(inputJson, Map.class));
            m2 = (Map<String, Object>) (serializer().mapper.readValue(resultJson, Map.class));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return m1.equals(m2);
    }
}















/* protected ObjectMapper getObjectMapperForDeserialization() {
       mapper = new ObjectMapper();

        StdTypeResolverBuilder typeResolverBuilder = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        typeResolverBuilder = typeResolverBuilder.inclusion(JsonTypeInfo.As.PROPERTY);
        typeResolverBuilder.init(JsonTypeInfo.Id.CLASS, new ClassNameIdResolver(SimpleType.construct(IMessage.class), TypeFactory.defaultInstance()) {
            private HashMap<Class, Class> classes = new HashMap<Class, Class>() {
                {
                    put(ControlMessageBase.class, CommandMessage.class);
                    put(MetaData.class, ControlIMeta.class);
                }
            };

            @Override
            public String idFromValue(Object value) {
                return (classes.containsKey(value.getClass())) ? value.getClass().getName() : null;
            }

            @Override
            public JavaType typeFromId(String id) {
                try {
                    return classes.get(Class.forName(id)) == null ? super.typeFromId(id) : _typeFactory.constructSpecializedType(_baseType, classes.get(Class.forName(id)));
                } catch (ClassNotFoundException e) {
                    //catch exe
                }
                return super.typeFromId(id);
            }
        });
        mapper.setDefaultTyping(typeResolverBuilder);
        return mapper;
    }
*/
   /* protected ObjectMapper getObjectMapperForSerialization() {
     *//*   ObjectMapper mapper = new ObjectMapper();*//*

        StdTypeResolverBuilder typeResolverBuilder = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        typeResolverBuilder = typeResolverBuilder.inclusion(JsonTypeInfo.As.PROPERTY);
        typeResolverBuilder.init(JsonTypeInfo.Id.CLASS, new ClassNameIdResolver(SimpleType.construct(IMessage.class), TypeFactory.defaultInstance()));
        mapper.setDefaultTyping(typeResolverBuilder);

        return mapper;
    }
*/