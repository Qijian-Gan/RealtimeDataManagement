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
package edu.berkeley.path;

import org.apache.activemq.ActiveMQPrefetchPolicy;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveMQHubConfig {


    private String activeMQBrokerUrl ="tcp://10.207.136.80:61616";

    @Autowired
    ActiveMQPrefetchPolicy prefetchPolicyHub;


    @Bean
    public ActiveMQConnectionFactory activeMQHubConnectionFactory() {
        ActiveMQConnectionFactory amqCF = new ActiveMQConnectionFactory();


        amqCF.setBrokerURL("tcp://10.207.136.80:61616");

        amqCF.setUseCompression(true);
        amqCF.setUseAsyncSend(true);
        amqCF.setOptimizeAcknowledge(true);
        amqCF.setAlwaysSessionAsync(false);
        amqCF.setPrefetchPolicy(prefetchPolicyHub);
        amqCF.setTrustAllPackages(true);

        return amqCF;
    }

}
