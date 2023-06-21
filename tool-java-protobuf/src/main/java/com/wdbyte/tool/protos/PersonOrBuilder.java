// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/addressbook.proto

package com.wdbyte.tool.protos;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.wdbyte.protobuf.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>optional string name = 2;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string email = 3;</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <code>optional string email = 3;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>optional string email = 3;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>repeated .com.wdbyte.protobuf.Person.PhoneNumber phones = 4;</code>
   */
  java.util.List<com.wdbyte.tool.protos.Person.PhoneNumber> 
      getPhonesList();
  /**
   * <code>repeated .com.wdbyte.protobuf.Person.PhoneNumber phones = 4;</code>
   */
  com.wdbyte.tool.protos.Person.PhoneNumber getPhones(int index);
  /**
   * <code>repeated .com.wdbyte.protobuf.Person.PhoneNumber phones = 4;</code>
   */
  int getPhonesCount();
  /**
   * <code>repeated .com.wdbyte.protobuf.Person.PhoneNumber phones = 4;</code>
   */
  java.util.List<? extends com.wdbyte.tool.protos.Person.PhoneNumberOrBuilder> 
      getPhonesOrBuilderList();
  /**
   * <code>repeated .com.wdbyte.protobuf.Person.PhoneNumber phones = 4;</code>
   */
  com.wdbyte.tool.protos.Person.PhoneNumberOrBuilder getPhonesOrBuilder(
      int index);
}