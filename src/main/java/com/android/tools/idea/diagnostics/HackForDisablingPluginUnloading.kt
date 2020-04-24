/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.tools.idea.diagnostics

/**
 * This plugin does not yet support dynamic unloading, mainly because it uses
 * an instrumentation agent on the boot classpath. IntelliJ does not seem to have a
 * mechanism for marking plugins ineligible for unloading, so instead we register
 * a fake component to implicitly disable unloading.
 *
 * See https://github.com/JetBrains/gradle-intellij-plugin/issues/476.
 */
class HackForDisablingPluginUnloading
