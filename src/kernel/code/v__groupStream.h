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

#ifndef V__GROUPSTREAM_H
#define V__GROUPSTREAM_H

#include "v_group.h"
#include "v_groupStream.h"
#include "kernelModuleI.h"

#if defined (__cplusplus)
extern "C" {
#endif

void
v_groupStreamConnectNewGroups (
    v_groupStream _this,
    v_group group);

void
v_groupStreamNotifyDataAvailable (
    v_groupStream _this);

v_writeResult
v_groupStreamWrite (
    v_groupStream _this,
    v_groupAction action);

c_bool
v_groupStreamSubscribe (
    v_groupStream _this,
    v_partition partition);
                                                         
c_bool
v_groupStreamUnSubscribe (
    v_groupStream _this,
    v_partition partition);
                                                         
c_bool
v_groupStreamSubscribeGroup (
    v_groupStream _this, 
    v_group group);
                                             
c_bool
v_groupStreamUnSubscribeGroup (
    v_groupStream _this, 
    v_group group);
                                             
#if defined (__cplusplus)
}
#endif

#endif
