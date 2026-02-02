/*
 * Copyright (C) 2026 The FlorisBoard Contributors
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

package dev.patrickgold.florisboard.app.localization

object Subtypes {

    const val TRACKMAN =
        """
        [
          {
            "id": 1769611616082,
            "primaryLocale": "en-US",
            "secondaryLocales": [],
            "nlpProviders": {
              "spelling": "org.florisboard.nlp.providers.latin",
              "suggestion": "org.florisboard.nlp.providers.latin"
            },
            "composer": "org.florisboard.composers:appender",
            "currencySet": "org.florisboard.currencysets:dollar",
            "punctuationRule": "org.florisboard.localization:default",
            "popupMapping": "org.florisboard.localization:en",
            "layoutMap": {
              "characters": "org.florisboard.layouts:qwerty",
              "symbols": "org.florisboard.layouts:western",
              "symbols2": "org.florisboard.layouts:western",
              "numeric": "org.florisboard.layouts:western_arabic",
              "numericAdvanced": "org.florisboard.layouts:western_arabic",
              "numericRow": "org.florisboard.layouts:western_arabic",
              "phone": "org.florisboard.layouts:telpad",
              "phone2": "org.florisboard.layouts:telpad"
            }
          },
          {
            "id": 1769611643712,
            "primaryLocale": "ja-JP-jis",
            "secondaryLocales": [],
            "nlpProviders": {
              "spelling": "org.florisboard.nlp.providers.latin",
              "suggestion": "org.florisboard.nlp.providers.latin"
            },
            "composer": "org.florisboard.composers:kana-unicode",
            "currencySet": "org.florisboard.currencysets:yen",
            "punctuationRule": "org.florisboard.localization:default",
            "popupMapping": "org.florisboard.localization:ja-JP-jis",
            "layoutMap": {
              "characters": "org.florisboard.layouts:jis",
              "symbols": "org.florisboard.layouts:cjk",
              "symbols2": "org.florisboard.layouts:cjk",
              "numeric": "org.florisboard.layouts:western_arabic",
              "numericAdvanced": "org.florisboard.layouts:western_arabic",
              "numericRow": "org.florisboard.layouts:cjk",
              "phone": "org.florisboard.layouts:telpad",
              "phone2": "org.florisboard.layouts:telpad"
            }
          },
          {
            "id": 1769611666307,
            "primaryLocale": "ko-KR",
            "secondaryLocales": [],
            "nlpProviders": {
              "spelling": "org.florisboard.nlp.providers.latin",
              "suggestion": "org.florisboard.nlp.providers.latin"
            },
            "composer": "org.florisboard.composers:hangul-unicode",
            "currencySet": "org.florisboard.currencysets:south_korean_won",
            "punctuationRule": "org.florisboard.localization:default",
            "popupMapping": "org.florisboard.localization:ko",
            "layoutMap": {
              "characters": "org.florisboard.layouts:korean_phonetic",
              "symbols": "org.florisboard.layouts:western",
              "symbols2": "org.florisboard.layouts:western",
              "numeric": "org.florisboard.layouts:western_arabic",
              "numericAdvanced": "org.florisboard.layouts:western_arabic",
              "numericRow": "org.florisboard.layouts:western_arabic",
              "phone": "org.florisboard.layouts:telpad",
              "phone2": "org.florisboard.layouts:telpad"
            }
          }
        ]
        """
}
