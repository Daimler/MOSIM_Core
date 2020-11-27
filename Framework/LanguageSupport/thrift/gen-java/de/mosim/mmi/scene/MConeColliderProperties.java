/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package de.mosim.mmi.scene;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-10-20")
public class MConeColliderProperties implements org.apache.thrift.TBase<MConeColliderProperties, MConeColliderProperties._Fields>, java.io.Serializable, Cloneable, Comparable<MConeColliderProperties> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MConeColliderProperties");

  private static final org.apache.thrift.protocol.TField RADIUS_FIELD_DESC = new org.apache.thrift.protocol.TField("Radius", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField HEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("Height", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MConeColliderPropertiesStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MConeColliderPropertiesTupleSchemeFactory();

  public double Radius; // required
  public double Height; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RADIUS((short)1, "Radius"),
    HEIGHT((short)2, "Height");

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
        case 1: // RADIUS
          return RADIUS;
        case 2: // HEIGHT
          return HEIGHT;
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
  private static final int __RADIUS_ISSET_ID = 0;
  private static final int __HEIGHT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RADIUS, new org.apache.thrift.meta_data.FieldMetaData("Radius", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.HEIGHT, new org.apache.thrift.meta_data.FieldMetaData("Height", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MConeColliderProperties.class, metaDataMap);
  }

  public MConeColliderProperties() {
  }

  public MConeColliderProperties(
    double Radius,
    double Height)
  {
    this();
    this.Radius = Radius;
    setRadiusIsSet(true);
    this.Height = Height;
    setHeightIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MConeColliderProperties(MConeColliderProperties other) {
    __isset_bitfield = other.__isset_bitfield;
    this.Radius = other.Radius;
    this.Height = other.Height;
  }

  public MConeColliderProperties deepCopy() {
    return new MConeColliderProperties(this);
  }

  @Override
  public void clear() {
    setRadiusIsSet(false);
    this.Radius = 0.0;
    setHeightIsSet(false);
    this.Height = 0.0;
  }

  public double getRadius() {
    return this.Radius;
  }

  public MConeColliderProperties setRadius(double Radius) {
    this.Radius = Radius;
    setRadiusIsSet(true);
    return this;
  }

  public void unsetRadius() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RADIUS_ISSET_ID);
  }

  /** Returns true if field Radius is set (has been assigned a value) and false otherwise */
  public boolean isSetRadius() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RADIUS_ISSET_ID);
  }

  public void setRadiusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RADIUS_ISSET_ID, value);
  }

  public double getHeight() {
    return this.Height;
  }

  public MConeColliderProperties setHeight(double Height) {
    this.Height = Height;
    setHeightIsSet(true);
    return this;
  }

  public void unsetHeight() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HEIGHT_ISSET_ID);
  }

  /** Returns true if field Height is set (has been assigned a value) and false otherwise */
  public boolean isSetHeight() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HEIGHT_ISSET_ID);
  }

  public void setHeightIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HEIGHT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RADIUS:
      if (value == null) {
        unsetRadius();
      } else {
        setRadius((java.lang.Double)value);
      }
      break;

    case HEIGHT:
      if (value == null) {
        unsetHeight();
      } else {
        setHeight((java.lang.Double)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RADIUS:
      return getRadius();

    case HEIGHT:
      return getHeight();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RADIUS:
      return isSetRadius();
    case HEIGHT:
      return isSetHeight();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MConeColliderProperties)
      return this.equals((MConeColliderProperties)that);
    return false;
  }

  public boolean equals(MConeColliderProperties that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_Radius = true;
    boolean that_present_Radius = true;
    if (this_present_Radius || that_present_Radius) {
      if (!(this_present_Radius && that_present_Radius))
        return false;
      if (this.Radius != that.Radius)
        return false;
    }

    boolean this_present_Height = true;
    boolean that_present_Height = true;
    if (this_present_Height || that_present_Height) {
      if (!(this_present_Height && that_present_Height))
        return false;
      if (this.Height != that.Height)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(Radius);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(Height);

    return hashCode;
  }

  @Override
  public int compareTo(MConeColliderProperties other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRadius()).compareTo(other.isSetRadius());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRadius()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Radius, other.Radius);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHeight()).compareTo(other.isSetHeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Height, other.Height);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MConeColliderProperties(");
    boolean first = true;

    sb.append("Radius:");
    sb.append(this.Radius);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Height:");
    sb.append(this.Height);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'Radius' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'Height' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
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

  private static class MConeColliderPropertiesStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MConeColliderPropertiesStandardScheme getScheme() {
      return new MConeColliderPropertiesStandardScheme();
    }
  }

  private static class MConeColliderPropertiesStandardScheme extends org.apache.thrift.scheme.StandardScheme<MConeColliderProperties> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MConeColliderProperties struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RADIUS
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.Radius = iprot.readDouble();
              struct.setRadiusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.Height = iprot.readDouble();
              struct.setHeightIsSet(true);
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
      if (!struct.isSetRadius()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'Radius' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetHeight()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'Height' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MConeColliderProperties struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RADIUS_FIELD_DESC);
      oprot.writeDouble(struct.Radius);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HEIGHT_FIELD_DESC);
      oprot.writeDouble(struct.Height);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MConeColliderPropertiesTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MConeColliderPropertiesTupleScheme getScheme() {
      return new MConeColliderPropertiesTupleScheme();
    }
  }

  private static class MConeColliderPropertiesTupleScheme extends org.apache.thrift.scheme.TupleScheme<MConeColliderProperties> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MConeColliderProperties struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeDouble(struct.Radius);
      oprot.writeDouble(struct.Height);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MConeColliderProperties struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.Radius = iprot.readDouble();
      struct.setRadiusIsSet(true);
      struct.Height = iprot.readDouble();
      struct.setHeightIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
