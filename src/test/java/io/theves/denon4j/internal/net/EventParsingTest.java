/*
 * Copyright 2017 Sascha Theves
 *
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

package io.theves.denon4j.internal.net;

import io.theves.denon4j.net.Event;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Class description.
 *
 * @author stheves
 */
public class EventParsingTest {
    @Test
    public void testParseNSE() {
        String msg = "NSE0 Hallo Welt_????";
        Event fromRawData = Event.create(msg.getBytes());
        assertThat(fromRawData).isNotNull();
        assertThat(fromRawData.getRaw()).isEqualTo(msg.getBytes());
    }
}
