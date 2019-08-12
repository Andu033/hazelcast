/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.sql.impl.expression.time;

import com.hazelcast.sql.impl.type.DataType;

/**
 * Temporal value obtained through string parsing.
 */
public class TemporalValue {
    /** Type. */
    private final DataType type;

    /** Value. */
    private final Object val;

    public TemporalValue(DataType type, Object val) {
        this.type = type;
        this.val = val;
    }

    public DataType getType() {
        return type;
    }

    public Object getValue() {
        return val;
    }
}
