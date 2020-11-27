/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package de.mosim.mmi.services;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-10-20")
public class MIKServiceResult implements org.apache.thrift.TBase<MIKServiceResult, MIKServiceResult._Fields>, java.io.Serializable, Cloneable, Comparable<MIKServiceResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MIKServiceResult");

  private static final org.apache.thrift.protocol.TField POSTURE_FIELD_DESC = new org.apache.thrift.protocol.TField("Posture", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("Success", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("Error", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MIKServiceResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MIKServiceResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable de.mosim.mmi.avatar.MAvatarPostureValues Posture; // required
  public boolean Success; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Double> Error; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POSTURE((short)1, "Posture"),
    SUCCESS((short)2, "Success"),
    ERROR((short)3, "Error");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // POSTURE
          return POSTURE;
        case 2: // SUCCESS
          return SUCCESS;
        case 3: // ERROR
          return ERROR;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SUCCESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POSTURE, new org.apache.thrift.meta_data.FieldMetaData("Posture", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, de.mosim.mmi.avatar.MAvatarPostureValues.class)));
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("Success", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("Error", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MIKServiceResult.class, metaDataMap);
  }

  public MIKServiceResult() {
  }

  public MIKServiceResult(
    de.mosim.mmi.avatar.MAvatarPostureValues Posture,
    boolean Success,
    java.util.List<java.lang.Double> Error)
  {
    this();
    this.Posture = Posture;
    this.Success = Success;
    setSuccessIsSet(true);
    this.Error = Error;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MIKServiceResult(MIKServiceResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPosture()) {
      this.Posture = new de.mosim.mmi.avatar.MAvatarPostureValues(other.Posture);
    }
    this.Success = other.Success;
    if (other.isSetError()) {
      java.util.List<java.lang.Double> __this__Error = new java.util.ArrayList<java.lang.Double>(other.Error);
      this.Error = __this__Error;
    }
  }

  public MIKServiceResult deepCopy() {
    return new MIKServiceResult(this);
  }

  @Override
  public void clear() {
    this.Posture = null;
    setSuccessIsSet(false);
    this.Success = false;
    this.Error = null;
  }

  @org.apache.thrift.annotation.Nullable
  public de.mosim.mmi.avatar.MAvatarPostureValues getPosture() {
    return this.Posture;
  }

  public MIKServiceResult setPosture(@org.apache.thrift.annotation.Nullable de.mosim.mmi.avatar.MAvatarPostureValues Posture) {
    this.Posture = Posture;
    return this;
  }

  public void unsetPosture() {
    this.Posture = null;
  }

  /** Returns true if field Posture is set (has been assigned a value) and false otherwise */
  public boolean isSetPosture() {
    return this.Posture != null;
  }

  public void setPostureIsSet(boolean value) {
    if (!value) {
      this.Posture = null;
    }
  }

  public boolean isSuccess() {
    return this.Success;
  }

  public MIKServiceResult setSuccess(boolean Success) {
    this.Success = Success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field Success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  public int getErrorSize() {
    return (this.Error == null) ? 0 : this.Error.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Double> getErrorIterator() {
    return (this.Error == null) ? null : this.Error.iterator();
  }

  public void addToError(double elem) {
    if (this.Error == null) {
      this.Error = new java.util.ArrayList<java.lang.Double>();
    }
    this.Error.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Double> getError() {
    return this.Error;
  }

  public MIKServiceResult setError(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Double> Error) {
    this.Error = Error;
    return this;
  }

  public void unsetError() {
    this.Error = null;
  }

  /** Returns true if field Error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return this.Error != null;
  }

  public void setErrorIsSet(boolean value) {
    if (!value) {
      this.Error = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case POSTURE:
      if (value == null) {
        unsetPosture();
      } else {
        setPosture((de.mosim.mmi.avatar.MAvatarPostureValues)value);
      }
      break;

    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((java.lang.Boolean)value);
      }
      break;

    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((java.util.List<java.lang.Double>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case POSTURE:
      return getPosture();

    case SUCCESS:
      return isSuccess();

    case ERROR:
      return getError();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case POSTURE:
      return isSetPosture();
    case SUCCESS:
      return isSetSuccess();
    case ERROR:
      return isSetError();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MIKServiceResult)
      return this.equals((MIKServiceResult)that);
    return false;
  }

  public boolean equals(MIKServiceResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_Posture = true && this.isSetPosture();
    boolean that_present_Posture = true && that.isSetPosture();
    if (this_present_Posture || that_present_Posture) {
      if (!(this_present_Posture && that_present_Posture))
        return false;
      if (!this.Posture.equals(that.Posture))
        return false;
    }

    boolean this_present_Success = true;
    boolean that_present_Success = true;
    if (this_present_Success || that_present_Success) {
      if (!(this_present_Success && that_present_Success))
        return false;
      if (this.Success != that.Success)
        return false;
    }

    boolean this_present_Error = true && this.isSetError();
    boolean that_present_Error = true && that.isSetError();
    if (this_present_Error || that_present_Error) {
      if (!(this_present_Error && that_present_Error))
        return false;
      if (!this.Error.equals(that.Error))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPosture()) ? 131071 : 524287);
    if (isSetPosture())
      hashCode = hashCode * 8191 + Posture.hashCode();

    hashCode = hashCode * 8191 + ((Success) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetError()) ? 131071 : 524287);
    if (isSetError())
      hashCode = hashCode * 8191 + Error.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MIKServiceResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPosture()).compareTo(other.isSetPosture());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosture()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Posture, other.Posture);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Success, other.Success);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetError()).compareTo(other.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Error, other.Error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MIKServiceResult(");
    boolean first = true;

    sb.append("Posture:");
    if (this.Posture == null) {
      sb.append("null");
    } else {
      sb.append(this.Posture);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Success:");
    sb.append(this.Success);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Error:");
    if (this.Error == null) {
      sb.append("null");
    } else {
      sb.append(this.Error);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (Posture == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Posture' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'Success' because it's a primitive and you chose the non-beans generator.
    if (Error == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Error' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (Posture != null) {
      Posture.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MIKServiceResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MIKServiceResultStandardScheme getScheme() {
      return new MIKServiceResultStandardScheme();
    }
  }

  private static class MIKServiceResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<MIKServiceResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MIKServiceResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POSTURE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.Posture = new de.mosim.mmi.avatar.MAvatarPostureValues();
              struct.Posture.read(iprot);
              struct.setPostureIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.Success = iprot.readBool();
              struct.setSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.Error = new java.util.ArrayList<java.lang.Double>(_list0.size);
                double _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readDouble();
                  struct.Error.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetSuccess()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'Success' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MIKServiceResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Posture != null) {
        oprot.writeFieldBegin(POSTURE_FIELD_DESC);
        struct.Posture.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.Success);
      oprot.writeFieldEnd();
      if (struct.Error != null) {
        oprot.writeFieldBegin(ERROR_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.Error.size()));
          for (double _iter3 : struct.Error)
          {
            oprot.writeDouble(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MIKServiceResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MIKServiceResultTupleScheme getScheme() {
      return new MIKServiceResultTupleScheme();
    }
  }

  private static class MIKServiceResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<MIKServiceResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MIKServiceResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.Posture.write(oprot);
      oprot.writeBool(struct.Success);
      {
        oprot.writeI32(struct.Error.size());
        for (double _iter4 : struct.Error)
        {
          oprot.writeDouble(_iter4);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MIKServiceResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.Posture = new de.mosim.mmi.avatar.MAvatarPostureValues();
      struct.Posture.read(iprot);
      struct.setPostureIsSet(true);
      struct.Success = iprot.readBool();
      struct.setSuccessIsSet(true);
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
        struct.Error = new java.util.ArrayList<java.lang.Double>(_list5.size);
        double _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = iprot.readDouble();
          struct.Error.add(_elem6);
        }
      }
      struct.setErrorIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
