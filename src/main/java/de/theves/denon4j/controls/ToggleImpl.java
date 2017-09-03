/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package de.theves.denon4j.controls;

import de.theves.denon4j.net.Protocol;

/**
 * Toggle control implementation.
 *
 * @author stheves
 */
public class ToggleImpl extends SwitchImpl implements Toggle {

    public ToggleImpl(Protocol protocol, String prefix, SwitchState on, SwitchState off) {
        super(protocol, prefix, on, off);
    }

    public void toggle() {
        if (onValue.equals(state())) {
            switchOff();
        } else {
            switchOn();
        }
    }
}