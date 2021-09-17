/*
 * MIT License
 *
 * Copyright 2020-2021 noahhusby
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.noahhusby.lib.data.storage.compare;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.Map;

public class CompareResult {
    private final JsonArray raw;
    private final Map<JsonObject, ComparatorAction> compared;
    private final boolean clear;
    private final String key;

    public CompareResult(JsonArray raw, Map<JsonObject, ComparatorAction> compared, String key, boolean clear) {
        this.raw = raw;
        this.compared = compared;
        this.key = key;
        this.clear = clear;
    }

    public Map<JsonObject, ComparatorAction> getComparedOutput() {
        return compared;
    }

    public JsonArray getRawOutput() {
        return raw;
    }

    public boolean isCleared() {
        return clear;
    }

    public String getKey() {
        return key;
    }
}
