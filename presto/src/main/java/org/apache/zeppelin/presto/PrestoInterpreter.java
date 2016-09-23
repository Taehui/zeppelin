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
 * Presto tnterpreter for Zeppelin.
 *
 * <ul>
 *   <li>{@code presto.url} - Presto Server URL</li>
 *   <li>{@code presto.catalog} - Presto Catalog</li>
 *   <li>{@code presto.schema} - Presto Schema</li>
 *   <li>{@code presto.rows.max} - Max Result Raw Size</li>
 * </ul>
 *
 * <p>
 * How to use: <br/>
 * {@code %presto<br/>
 * {@code
 *  SELECT column1, count(*) cnt
 *  FROM [schema].[database].[table]
 *  GROUP BY column1
 *  ORDER BY 2 cnt DESC
 *  LIMIT 10
 * }
 * </p>
 */
public class PrestoInterpreter extends Interpreter {

  Logger logger = LoggerFactory.getLogger(PrestoInterpreter.class);

  static final String PRESTOSERVER_URL = "presto.url";
  static final String PRESTOSERVER_CATALOG = "presto.catalog";
  static final String PRESTOSERVER_SCHEMA = "presto.schema";
  static final String PRESTO_MAX_ROW = "presto.rows.max";

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
