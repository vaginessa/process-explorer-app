/*
* Copyright (C) 2014 Opersys inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.opersys.processexplorer.node;

import com.opersys.processexplorer.ProcessExplorerServiceBinder;
import com.opersys.processexplorer.node.NodeThreadEvent;
import com.opersys.processexplorer.node.NodeThreadEventData;

/**
 * Author: François-Denis Gonthier (francois-denis.gonthier@opersys.com)
 */
public interface NodeThreadListener {

    void onProcessServiceConnected(ProcessExplorerServiceBinder service);

    void onProcessServiceDisconnected();

    void ProcessExplorerServiceEvent(NodeThreadEvent ev, NodeThreadEventData evData);
}
