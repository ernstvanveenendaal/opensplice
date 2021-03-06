/*
 *                         OpenSplice DDS
 *
 *   This software and documentation are Copyright 2006 to TO_YEAR PrismTech
 *   Limited, its affiliated companies and licensors. All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.opensplice.dds.dcps;

public class MultiTopicBase extends ObjectImpl {

    @Override
    protected int deinit() {
        return super.deinit();
    }

    public class MultiTopicBaseImpl extends DDS._MultiTopicLocalBase {
        private static final long serialVersionUID = -7047467467646052020L;

        /* multitopic operations */
        @Override
        public java.lang.String get_subscription_expression() {
            return null;
        }

        @Override
        public int get_expression_parameters(
                DDS.StringSeqHolder expression_parameters) {
            return 0;
        }

        @Override
        public int set_expression_parameters(
                java.lang.String[] expression_parameters) {
            return 0;
        }

        /* topicdescription operations */
        @Override
        public java.lang.String get_type_name() {
            return null;
        }

        @Override
        public java.lang.String get_name() {
            return null;
        }

        @Override
        public DDS.DomainParticipant get_participant() {
            return null;
        }
    }

    private DDS._MultiTopicLocalBase base;

    public MultiTopicBase() {
        base = new MultiTopicBaseImpl();
    }

    @Override
    public String[] _ids() {
        return base._ids();
    }
}
