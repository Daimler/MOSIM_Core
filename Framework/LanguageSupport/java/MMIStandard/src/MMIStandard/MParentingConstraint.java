/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package MMIStandard;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-02")
public class MParentingConstraint implements org.apache.thrift.TBase<MParentingConstraint, MParentingConstraint._Fields>, java.io.Serializable, Cloneable, Comparable<MParentingConstraint> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MParentingConstraint");

  private static final org.apache.thrift.protocol.TField PARENT_FIELD_DESC = new org.apache.thrift.protocol.TField("Parent", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CHILDREN_FIELD_DESC = new org.apache.thrift.protocol.TField("Children", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField POSITION_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("PositionOffset", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ROTATION_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("RotationOffset", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MParentingConstraintStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MParentingConstraintTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String Parent; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String Children; // required
  public @org.apache.thrift.annotation.Nullable MMIStandard.MVector3 PositionOffset; // required
  public @org.apache.thrift.annotation.Nullable MMIStandard.MQuaternion RotationOffset; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARENT((short)1, "Parent"),
    CHILDREN((short)2, "Children"),
    POSITION_OFFSET((short)3, "PositionOffset"),
    ROTATION_OFFSET((short)4, "RotationOffset");

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
        case 1: // PARENT
          return PARENT;
        case 2: // CHILDREN
          return CHILDREN;
        case 3: // POSITION_OFFSET
          return POSITION_OFFSET;
        case 4: // ROTATION_OFFSET
          return ROTATION_OFFSET;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARENT, new org.apache.thrift.meta_data.FieldMetaData("Parent", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHILDREN, new org.apache.thrift.meta_data.FieldMetaData("Children", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POSITION_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("PositionOffset", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MMIStandard.MVector3.class)));
    tmpMap.put(_Fields.ROTATION_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("RotationOffset", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MMIStandard.MQuaternion.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MParentingConstraint.class, metaDataMap);
  }

  public MParentingConstraint() {
  }

  public MParentingConstraint(
    java.lang.String Parent,
    java.lang.String Children,
    MMIStandard.MVector3 PositionOffset,
    MMIStandard.MQuaternion RotationOffset)
  {
    this();
    this.Parent = Parent;
    this.Children = Children;
    this.PositionOffset = PositionOffset;
    this.RotationOffset = RotationOffset;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MParentingConstraint(MParentingConstraint other) {
    if (other.isSetParent()) {
      this.Parent = other.Parent;
    }
    if (other.isSetChildren()) {
      this.Children = other.Children;
    }
    if (other.isSetPositionOffset()) {
      this.PositionOffset = new MMIStandard.MVector3(other.PositionOffset);
    }
    if (other.isSetRotationOffset()) {
      this.RotationOffset = new MMIStandard.MQuaternion(other.RotationOffset);
    }
  }

  public MParentingConstraint deepCopy() {
    return new MParentingConstraint(this);
  }

  @Override
  public void clear() {
    this.Parent = null;
    this.Children = null;
    this.PositionOffset = null;
    this.RotationOffset = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getParent() {
    return this.Parent;
  }

  public MParentingConstraint setParent(@org.apache.thrift.annotation.Nullable java.lang.String Parent) {
    this.Parent = Parent;
    return this;
  }

  public void unsetParent() {
    this.Parent = null;
  }

  /** Returns true if field Parent is set (has been assigned a value) and false otherwise */
  public boolean isSetParent() {
    return this.Parent != null;
  }

  public void setParentIsSet(boolean value) {
    if (!value) {
      this.Parent = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getChildren() {
    return this.Children;
  }

  public MParentingConstraint setChildren(@org.apache.thrift.annotation.Nullable java.lang.String Children) {
    this.Children = Children;
    return this;
  }

  public void unsetChildren() {
    this.Children = null;
  }

  /** Returns true if field Children is set (has been assigned a value) and false otherwise */
  public boolean isSetChildren() {
    return this.Children != null;
  }

  public void setChildrenIsSet(boolean value) {
    if (!value) {
      this.Children = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public MMIStandard.MVector3 getPositionOffset() {
    return this.PositionOffset;
  }

  public MParentingConstraint setPositionOffset(@org.apache.thrift.annotation.Nullable MMIStandard.MVector3 PositionOffset) {
    this.PositionOffset = PositionOffset;
    return this;
  }

  public void unsetPositionOffset() {
    this.PositionOffset = null;
  }

  /** Returns true if field PositionOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetPositionOffset() {
    return this.PositionOffset != null;
  }

  public void setPositionOffsetIsSet(boolean value) {
    if (!value) {
      this.PositionOffset = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public MMIStandard.MQuaternion getRotationOffset() {
    return this.RotationOffset;
  }

  public MParentingConstraint setRotationOffset(@org.apache.thrift.annotation.Nullable MMIStandard.MQuaternion RotationOffset) {
    this.RotationOffset = RotationOffset;
    return this;
  }

  public void unsetRotationOffset() {
    this.RotationOffset = null;
  }

  /** Returns true if field RotationOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetRotationOffset() {
    return this.RotationOffset != null;
  }

  public void setRotationOffsetIsSet(boolean value) {
    if (!value) {
      this.RotationOffset = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARENT:
      if (value == null) {
        unsetParent();
      } else {
        setParent((java.lang.String)value);
      }
      break;

    case CHILDREN:
      if (value == null) {
        unsetChildren();
      } else {
        setChildren((java.lang.String)value);
      }
      break;

    case POSITION_OFFSET:
      if (value == null) {
        unsetPositionOffset();
      } else {
        setPositionOffset((MMIStandard.MVector3)value);
      }
      break;

    case ROTATION_OFFSET:
      if (value == null) {
        unsetRotationOffset();
      } else {
        setRotationOffset((MMIStandard.MQuaternion)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARENT:
      return getParent();

    case CHILDREN:
      return getChildren();

    case POSITION_OFFSET:
      return getPositionOffset();

    case ROTATION_OFFSET:
      return getRotationOffset();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PARENT:
      return isSetParent();
    case CHILDREN:
      return isSetChildren();
    case POSITION_OFFSET:
      return isSetPositionOffset();
    case ROTATION_OFFSET:
      return isSetRotationOffset();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MParentingConstraint)
      return this.equals((MParentingConstraint)that);
    return false;
  }

  public boolean equals(MParentingConstraint that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_Parent = true && this.isSetParent();
    boolean that_present_Parent = true && that.isSetParent();
    if (this_present_Parent || that_present_Parent) {
      if (!(this_present_Parent && that_present_Parent))
        return false;
      if (!this.Parent.equals(that.Parent))
        return false;
    }

    boolean this_present_Children = true && this.isSetChildren();
    boolean that_present_Children = true && that.isSetChildren();
    if (this_present_Children || that_present_Children) {
      if (!(this_present_Children && that_present_Children))
        return false;
      if (!this.Children.equals(that.Children))
        return false;
    }

    boolean this_present_PositionOffset = true && this.isSetPositionOffset();
    boolean that_present_PositionOffset = true && that.isSetPositionOffset();
    if (this_present_PositionOffset || that_present_PositionOffset) {
      if (!(this_present_PositionOffset && that_present_PositionOffset))
        return false;
      if (!this.PositionOffset.equals(that.PositionOffset))
        return false;
    }

    boolean this_present_RotationOffset = true && this.isSetRotationOffset();
    boolean that_present_RotationOffset = true && that.isSetRotationOffset();
    if (this_present_RotationOffset || that_present_RotationOffset) {
      if (!(this_present_RotationOffset && that_present_RotationOffset))
        return false;
      if (!this.RotationOffset.equals(that.RotationOffset))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetParent()) ? 131071 : 524287);
    if (isSetParent())
      hashCode = hashCode * 8191 + Parent.hashCode();

    hashCode = hashCode * 8191 + ((isSetChildren()) ? 131071 : 524287);
    if (isSetChildren())
      hashCode = hashCode * 8191 + Children.hashCode();

    hashCode = hashCode * 8191 + ((isSetPositionOffset()) ? 131071 : 524287);
    if (isSetPositionOffset())
      hashCode = hashCode * 8191 + PositionOffset.hashCode();

    hashCode = hashCode * 8191 + ((isSetRotationOffset()) ? 131071 : 524287);
    if (isSetRotationOffset())
      hashCode = hashCode * 8191 + RotationOffset.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MParentingConstraint other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetParent()).compareTo(other.isSetParent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Parent, other.Parent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetChildren()).compareTo(other.isSetChildren());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChildren()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Children, other.Children);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPositionOffset()).compareTo(other.isSetPositionOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPositionOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.PositionOffset, other.PositionOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRotationOffset()).compareTo(other.isSetRotationOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRotationOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.RotationOffset, other.RotationOffset);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MParentingConstraint(");
    boolean first = true;

    sb.append("Parent:");
    if (this.Parent == null) {
      sb.append("null");
    } else {
      sb.append(this.Parent);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Children:");
    if (this.Children == null) {
      sb.append("null");
    } else {
      sb.append(this.Children);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("PositionOffset:");
    if (this.PositionOffset == null) {
      sb.append("null");
    } else {
      sb.append(this.PositionOffset);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("RotationOffset:");
    if (this.RotationOffset == null) {
      sb.append("null");
    } else {
      sb.append(this.RotationOffset);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (Parent == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Parent' was not present! Struct: " + toString());
    }
    if (Children == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Children' was not present! Struct: " + toString());
    }
    if (PositionOffset == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'PositionOffset' was not present! Struct: " + toString());
    }
    if (RotationOffset == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'RotationOffset' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (PositionOffset != null) {
      PositionOffset.validate();
    }
    if (RotationOffset != null) {
      RotationOffset.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MParentingConstraintStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MParentingConstraintStandardScheme getScheme() {
      return new MParentingConstraintStandardScheme();
    }
  }

  private static class MParentingConstraintStandardScheme extends org.apache.thrift.scheme.StandardScheme<MParentingConstraint> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MParentingConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Parent = iprot.readString();
              struct.setParentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHILDREN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Children = iprot.readString();
              struct.setChildrenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POSITION_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.PositionOffset = new MMIStandard.MVector3();
              struct.PositionOffset.read(iprot);
              struct.setPositionOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROTATION_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.RotationOffset = new MMIStandard.MQuaternion();
              struct.RotationOffset.read(iprot);
              struct.setRotationOffsetIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MParentingConstraint struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Parent != null) {
        oprot.writeFieldBegin(PARENT_FIELD_DESC);
        oprot.writeString(struct.Parent);
        oprot.writeFieldEnd();
      }
      if (struct.Children != null) {
        oprot.writeFieldBegin(CHILDREN_FIELD_DESC);
        oprot.writeString(struct.Children);
        oprot.writeFieldEnd();
      }
      if (struct.PositionOffset != null) {
        oprot.writeFieldBegin(POSITION_OFFSET_FIELD_DESC);
        struct.PositionOffset.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.RotationOffset != null) {
        oprot.writeFieldBegin(ROTATION_OFFSET_FIELD_DESC);
        struct.RotationOffset.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MParentingConstraintTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MParentingConstraintTupleScheme getScheme() {
      return new MParentingConstraintTupleScheme();
    }
  }

  private static class MParentingConstraintTupleScheme extends org.apache.thrift.scheme.TupleScheme<MParentingConstraint> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MParentingConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.Parent);
      oprot.writeString(struct.Children);
      struct.PositionOffset.write(oprot);
      struct.RotationOffset.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MParentingConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.Parent = iprot.readString();
      struct.setParentIsSet(true);
      struct.Children = iprot.readString();
      struct.setChildrenIsSet(true);
      struct.PositionOffset = new MMIStandard.MVector3();
      struct.PositionOffset.read(iprot);
      struct.setPositionOffsetIsSet(true);
      struct.RotationOffset = new MMIStandard.MQuaternion();
      struct.RotationOffset.read(iprot);
      struct.setRotationOffsetIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

