/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tensorflow.lite.examples.objectdetection.data

import org.tensorflow.lite.examples.objectdetection.R
import org.tensorflow.lite.examples.objectdetection.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {

    fun loadPhrase(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.class_phrase1, R.drawable.goodbye),
            Affirmation(R.string.class_phrase2, R.drawable.hello),
            Affirmation(R.string.class_phrase3, R.drawable.i_love_you),
            Affirmation(R.string.class_phrase4, R.drawable.no),
            Affirmation(R.string.class_phrase5, R.drawable.salamat),
            Affirmation(R.string.class_phrase6, R.drawable.yes)
        )
    }

    fun loadAlphabet(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.class_alphabet1, R.drawable.letter_a),
            Affirmation(R.string.class_alphabet2, R.drawable.letter_b),
            Affirmation(R.string.class_alphabet3, R.drawable.letter_c),
            Affirmation(R.string.class_alphabet4, R.drawable.letter_d),
            Affirmation(R.string.class_alphabet5, R.drawable.letter_e),
            Affirmation(R.string.class_alphabet6, R.drawable.letter_f),
            Affirmation(R.string.class_alphabet7, R.drawable.letter_g),
            Affirmation(R.string.class_alphabet8, R.drawable.letter_h),
            Affirmation(R.string.class_alphabet9, R.drawable.letter_i),
            Affirmation(R.string.class_alphabet10, R.drawable.letter_j),
            Affirmation(R.string.class_alphabet11, R.drawable.letter_k),
            Affirmation(R.string.class_alphabet12, R.drawable.letter_l),
            Affirmation(R.string.class_alphabet13, R.drawable.letter_m),
            Affirmation(R.string.class_alphabet14, R.drawable.letter_n),
            Affirmation(R.string.class_alphabet15, R.drawable.letter_o),
            Affirmation(R.string.class_alphabet16, R.drawable.letter_p),
            Affirmation(R.string.class_alphabet17, R.drawable.letter_q),
            Affirmation(R.string.class_alphabet18, R.drawable.letter_r),
            Affirmation(R.string.class_alphabet19, R.drawable.letter_s),
            Affirmation(R.string.class_alphabet20, R.drawable.letter_t),
            Affirmation(R.string.class_alphabet21, R.drawable.letter_u),
            Affirmation(R.string.class_alphabet22, R.drawable.letter_v),
            Affirmation(R.string.class_alphabet23, R.drawable.letter_w),
            Affirmation(R.string.class_alphabet24, R.drawable.letter_x),
            Affirmation(R.string.class_alphabet25, R.drawable.letter_y),
            Affirmation(R.string.class_alphabet26, R.drawable.letter_z)
        )
    }

    fun loadNumbers(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.class_num1, R.drawable.number_0010),
            Affirmation(R.string.class_num2, R.drawable.number_0009),
            Affirmation(R.string.class_num3, R.drawable.number_0008),
            Affirmation(R.string.class_num4, R.drawable.number_0007),
            Affirmation(R.string.class_num5, R.drawable.number_0006),
            Affirmation(R.string.class_num6, R.drawable.number_0005),
            Affirmation(R.string.class_num7, R.drawable.number_0004),
            Affirmation(R.string.class_num8, R.drawable.number_0003),
            Affirmation(R.string.class_num9, R.drawable.number_0002),
            Affirmation(R.string.class_num10, R.drawable.number_0001),
        )
    }

    fun loadGame(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.class_rock, R.drawable.rock),
            Affirmation(R.string.class_paper, R.drawable.paper),
            Affirmation(R.string.class_scissors, R.drawable.scissors)
        )
    }
}

