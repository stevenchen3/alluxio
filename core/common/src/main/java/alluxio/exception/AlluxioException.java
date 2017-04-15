/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.exception;

import alluxio.thrift.AlluxioTException;

import javax.annotation.concurrent.ThreadSafe;

/**
 * General {@link AlluxioException} used throughout the system. It must be able serialize itself to
 * the RPC framework and convert back without losing any necessary information.
 */
@ThreadSafe
public class AlluxioException extends Exception {
  private static final long serialVersionUID = 2243833925609642384L;

  /**
   * Constructs a {@link AlluxioException} with an exception type from a {@link AlluxioTException}.
   *
   * @param te the type of the exception
   */
  protected AlluxioException(AlluxioTException te) {
    super(te.getMessage());
  }

  /**
   * Constructs an {@link AlluxioException} with the given cause.
   *
   * @param cause the cause
   */
  public AlluxioException(Throwable cause) {
    super(cause);
  }

  /**
   * Constructs an {@link AlluxioException} with the given message.
   *
   * @param message the message
   */
  public AlluxioException(String message) {
    super(message);
  }

  /**
   * Constructs an {@link AlluxioException} with the given message and cause.
   *
   * @param message the message
   * @param cause the cause
   */
  protected AlluxioException(String message, Throwable cause) {
    super(message, cause);
  }
}
