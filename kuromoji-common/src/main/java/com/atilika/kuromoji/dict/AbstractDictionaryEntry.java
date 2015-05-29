/**
 * Copyright 2010-2015 Atilika Inc. and contributors (see CONTRIBUTORS.md)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  A copy of the
 * License is distributed with this work in the LICENSE.md file.  You may
 * also obtain a copy of the License from
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.atilika.kuromoji.dict;

import com.atilika.kuromoji.TokenEntry;

import static java.lang.Short.parseShort;

public abstract class AbstractDictionaryEntry implements TokenEntry {

    protected final String surface;
    protected final short leftId;
    protected final short rightId;
    protected final short wordCost;

    public AbstractDictionaryEntry(String surface, short leftId, short rightId, short wordCost) {
        this.surface = surface;
        this.rightId = rightId;
        this.leftId = leftId;
        this.wordCost = wordCost;
    }

    public AbstractDictionaryEntry(String[] fields) {
        this(
            fields[DictionaryField.SURFACE],
            parseShort(fields[DictionaryField.LEFT_ID]),
            parseShort(fields[DictionaryField.RIGHT_ID]),
            parseShort(fields[DictionaryField.WORD_COST])
        );
    }

    public String getSurface() {
        return surface;
    }

    public short getLeftId() {
        return leftId;
    }

    public short getRightId() {
        return rightId;
    }

    public short getWordCost() {
        return wordCost;
    }
}