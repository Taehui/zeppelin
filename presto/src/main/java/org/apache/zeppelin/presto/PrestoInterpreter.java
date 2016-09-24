/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.zeppelin.presto;

import org.apache.zeppelin.interpreter.Interpreter;
import org.apache.zeppelin.interpreter.InterpreterContext;
import org.apache.zeppelin.interpreter.InterpreterResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * Presto interpreter for Zeppelin.
 *
 * <ul>
 *   <li>{@code zeppelin.presto.project_id} - ?? </li>
 *   <li>{@code zeppelin.presto.wait_time} - ?? </li>
 *   <li>{@code zeppelin.presto.max_no_of_rows} - ?? </li>
 * </ul>
 *
 * <p>
 * How to use: <br/>
 * {@code %presto<br/>
 * {@code
 *   SELECT column1, count(*) cnt
 *   FROM [schema].[database].[table]
 *   GROUP BY column1
 *   ORDER BY 3 cnt desc
 *   LIMIT 10
 * }
 * </p>
 */
public class PrestoInterpreter extends Interpreter {

  Logger logger = LoggerFactory.getLogger(PrestoInterpreter.class);

  public PrestoInterpreter(Properties property) {
    super(property);
  }

  @Override
  public void open() {

  }

  @Override
  public void close() {

  }

  @Override
  public InterpreterResult interpret(String st, InterpreterContext context) {
    return null;
  }

  @Override
  public void cancel(InterpreterContext context) {

  }

  @Override
  public FormType getFormType() {
    return null;
  }

  @Override
  public int getProgress(InterpreterContext context) {
    return 0;
  }

}
