/* Copyright (c) 2015 Bernd Wengenroth
 * Licensed under the Apache License, Version 2.0.
 * See LICENSE file for details.
 */
package bweng.thrift.parser.model;

/**
 * Part of the data model, base class to store parser information.
 */
public class ThriftParserInfo
{
   // 0-based line of declaration.
   public int line_;
   public int column_;
}
