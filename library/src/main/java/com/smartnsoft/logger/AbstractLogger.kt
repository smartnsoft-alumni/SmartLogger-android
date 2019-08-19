// The MIT License (MIT)
//
// Copyright (c) 2019 Smart&Soft
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.

package com.smartnsoft.logger

import android.util.Log

/**
 *
 * @author Cyllene
 * @since 2019.08.06
 */
abstract class AbstractLogger(category: String?, @LoggerFactory.LogLevel var logLevel: Int?) : Logger
{

  constructor(theClass: Class<*>, @LoggerFactory.LogLevel logLevel: Int?) : this(theClass.simpleName, logLevel)

  private val currentLogLevel: Int
    get()
    {
      return logLevel ?: LoggerFactory.logLevel
    }

  override val isVerboseEnabled: Boolean
    get() = currentLogLevel <= Log.VERBOSE

  override val isDebugEnabled: Boolean
    get() = currentLogLevel <= Log.DEBUG

  override val isInfoEnabled: Boolean
    get() = currentLogLevel <= Log.INFO

  override val isWarnEnabled: Boolean
    get() = currentLogLevel <= Log.WARN

  override val isErrorEnabled: Boolean
    get() = currentLogLevel <= Log.ERROR

  override val isFatalEnabled: Boolean
    get() = currentLogLevel <= Log.ERROR

}