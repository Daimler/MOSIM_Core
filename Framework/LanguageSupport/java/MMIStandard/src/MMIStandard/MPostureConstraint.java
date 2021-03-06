/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package MMIStandard;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-02")
public class MPostureConstraint implements org.apache.thrift.TBase<MPostureConstraint, MPostureConstraint._Fields>, java.io.Serializable, Cloneable, Comparable<MPostureConstraint> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MPostureConstraint");

  private static final org.apache.thrift.protocol.TField POSTURE_FIELD_DESC = new org.apache.thrift.protocol.TField("Posture", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("Weight", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField VELOCITY_FIELD_DESC = new org.apache.thrift.protocol.TField("Velocity", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField ACCELERATION_FIELD_DESC = new org.apache.thrift.protocol.TField("Acceleration", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MPostureConstraintStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MPostureConstraintTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable MMIStandard.MAvatarPosture Posture; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<MMIStandard.MJointType,java.lang.Double> Weight; // optional
  public @org.apache.thrift.annotation.Nullable java.util.Map<MMIStandard.MJointType,java.lang.Double> Velocity; // optional
  public @org.apache.thrift.annotation.Nullable java.util.Map<MMIStandard.MJointType,java.lang.Double> Acceleration; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POSTURE((short)1, "Posture"),
    WEIGHT((short)2, "Weight"),
    VELOCITY((short)3, "Velocity"),
    ACCELERATION((short)4, "Acceleration");

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
        case 2: // WEIGHT
          return WEIGHT;
        case 3: // VELOCITY
          return VELOCITY;
        case 4: // ACCELERATION
          return ACCELERATION;
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
  private static final _Fields optionals[] = {_Fields.WEIGHT,_Fields.VELOCITY,_Fields.ACCELERATION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POSTURE, new org.apache.thrift.meta_data.FieldMetaData("Posture", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MMIStandard.MAvatarPosture.class)));
    tmpMap.put(_Fields.WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("Weight", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MMIStandard.MJointType.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.VELOCITY, new org.apache.thrift.meta_data.FieldMetaData("Velocity", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MMIStandard.MJointType.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.ACCELERATION, new org.apache.thrift.meta_data.FieldMetaData("Acceleration", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MMIStandard.MJointType.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MPostureConstraint.class, metaDataMap);
  }

  public MPostureConstraint() {
  }

  public MPostureConstraint(
    MMIStandard.MAvatarPosture Posture)
  {
    this();
    this.Posture = Posture;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MPostureConstraint(MPostureConstraint other) {
    if (other.isSetPosture()) {
      this.Posture = new MMIStandard.MAvatarPosture(other.Posture);
    }
    if (other.isSetWeight()) {
      java.util.Map<MMIStandard.MJointType,java.lang.Double> __this__Weight = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
      for (java.util.Map.Entry<MMIStandard.MJointType, java.lang.Double> other_element : other.Weight.entrySet()) {

        MMIStandard.MJointType other_element_key = other_element.getKey();
        java.lang.Double other_element_value = other_element.getValue();

        MMIStandard.MJointType __this__Weight_copy_key = other_element_key;

        java.lang.Double __this__Weight_copy_value = other_element_value;

        __this__Weight.put(__this__Weight_copy_key, __this__Weight_copy_value);
      }
      this.Weight = __this__Weight;
    }
    if (other.isSetVelocity()) {
      java.util.Map<MMIStandard.MJointType,java.lang.Double> __this__Velocity = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
      for (java.util.Map.Entry<MMIStandard.MJointType, java.lang.Double> other_element : other.Velocity.entrySet()) {

        MMIStandard.MJointType other_element_key = other_element.getKey();
        java.lang.Double other_element_value = other_element.getValue();

        MMIStandard.MJointType __this__Velocity_copy_key = other_element_key;

        java.lang.Double __this__Velocity_copy_value = other_element_value;

        __this__Velocity.put(__this__Velocity_copy_key, __this__Velocity_copy_value);
      }
      this.Velocity = __this__Velocity;
    }
    if (other.isSetAcceleration()) {
      java.util.Map<MMIStandard.MJointType,java.lang.Double> __this__Acceleration = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
      for (java.util.Map.Entry<MMIStandard.MJointType, java.lang.Double> other_element : other.Acceleration.entrySet()) {

        MMIStandard.MJointType other_element_key = other_element.getKey();
        java.lang.Double other_element_value = other_element.getValue();

        MMIStandard.MJointType __this__Acceleration_copy_key = other_element_key;

        java.lang.Double __this__Acceleration_copy_value = other_element_value;

        __this__Acceleration.put(__this__Acceleration_copy_key, __this__Acceleration_copy_value);
      }
      this.Acceleration = __this__Acceleration;
    }
  }

  public MPostureConstraint deepCopy() {
    return new MPostureConstraint(this);
  }

  @Override
  public void clear() {
    this.Posture = null;
    this.Weight = null;
    this.Velocity = null;
    this.Acceleration = null;
  }

  @org.apache.thrift.annotation.Nullable
  public MMIStandard.MAvatarPosture getPosture() {
    return this.Posture;
  }

  public MPostureConstraint setPosture(@org.apache.thrift.annotation.Nullable MMIStandard.MAvatarPosture Posture) {
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

  public int getWeightSize() {
    return (this.Weight == null) ? 0 : this.Weight.size();
  }

  public void putToWeight(MMIStandard.MJointType key, double val) {
    if (this.Weight == null) {
      this.Weight = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
    }
    this.Weight.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<MMIStandard.MJointType,java.lang.Double> getWeight() {
    return this.Weight;
  }

  public MPostureConstraint setWeight(@org.apache.thrift.annotation.Nullable java.util.Map<MMIStandard.MJointType,java.lang.Double> Weight) {
    this.Weight = Weight;
    return this;
  }

  public void unsetWeight() {
    this.Weight = null;
  }

  /** Returns true if field Weight is set (has been assigned a value) and false otherwise */
  public boolean isSetWeight() {
    return this.Weight != null;
  }

  public void setWeightIsSet(boolean value) {
    if (!value) {
      this.Weight = null;
    }
  }

  public int getVelocitySize() {
    return (this.Velocity == null) ? 0 : this.Velocity.size();
  }

  public void putToVelocity(MMIStandard.MJointType key, double val) {
    if (this.Velocity == null) {
      this.Velocity = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
    }
    this.Velocity.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<MMIStandard.MJointType,java.lang.Double> getVelocity() {
    return this.Velocity;
  }

  public MPostureConstraint setVelocity(@org.apache.thrift.annotation.Nullable java.util.Map<MMIStandard.MJointType,java.lang.Double> Velocity) {
    this.Velocity = Velocity;
    return this;
  }

  public void unsetVelocity() {
    this.Velocity = null;
  }

  /** Returns true if field Velocity is set (has been assigned a value) and false otherwise */
  public boolean isSetVelocity() {
    return this.Velocity != null;
  }

  public void setVelocityIsSet(boolean value) {
    if (!value) {
      this.Velocity = null;
    }
  }

  public int getAccelerationSize() {
    return (this.Acceleration == null) ? 0 : this.Acceleration.size();
  }

  public void putToAcceleration(MMIStandard.MJointType key, double val) {
    if (this.Acceleration == null) {
      this.Acceleration = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
    }
    this.Acceleration.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<MMIStandard.MJointType,java.lang.Double> getAcceleration() {
    return this.Acceleration;
  }

  public MPostureConstraint setAcceleration(@org.apache.thrift.annotation.Nullable java.util.Map<MMIStandard.MJointType,java.lang.Double> Acceleration) {
    this.Acceleration = Acceleration;
    return this;
  }

  public void unsetAcceleration() {
    this.Acceleration = null;
  }

  /** Returns true if field Acceleration is set (has been assigned a value) and false otherwise */
  public boolean isSetAcceleration() {
    return this.Acceleration != null;
  }

  public void setAccelerationIsSet(boolean value) {
    if (!value) {
      this.Acceleration = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case POSTURE:
      if (value == null) {
        unsetPosture();
      } else {
        setPosture((MMIStandard.MAvatarPosture)value);
      }
      break;

    case WEIGHT:
      if (value == null) {
        unsetWeight();
      } else {
        setWeight((java.util.Map<MMIStandard.MJointType,java.lang.Double>)value);
      }
      break;

    case VELOCITY:
      if (value == null) {
        unsetVelocity();
      } else {
        setVelocity((java.util.Map<MMIStandard.MJointType,java.lang.Double>)value);
      }
      break;

    case ACCELERATION:
      if (value == null) {
        unsetAcceleration();
      } else {
        setAcceleration((java.util.Map<MMIStandard.MJointType,java.lang.Double>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case POSTURE:
      return getPosture();

    case WEIGHT:
      return getWeight();

    case VELOCITY:
      return getVelocity();

    case ACCELERATION:
      return getAcceleration();

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
    case WEIGHT:
      return isSetWeight();
    case VELOCITY:
      return isSetVelocity();
    case ACCELERATION:
      return isSetAcceleration();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MPostureConstraint)
      return this.equals((MPostureConstraint)that);
    return false;
  }

  public boolean equals(MPostureConstraint that) {
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

    boolean this_present_Weight = true && this.isSetWeight();
    boolean that_present_Weight = true && that.isSetWeight();
    if (this_present_Weight || that_present_Weight) {
      if (!(this_present_Weight && that_present_Weight))
        return false;
      if (!this.Weight.equals(that.Weight))
        return false;
    }

    boolean this_present_Velocity = true && this.isSetVelocity();
    boolean that_present_Velocity = true && that.isSetVelocity();
    if (this_present_Velocity || that_present_Velocity) {
      if (!(this_present_Velocity && that_present_Velocity))
        return false;
      if (!this.Velocity.equals(that.Velocity))
        return false;
    }

    boolean this_present_Acceleration = true && this.isSetAcceleration();
    boolean that_present_Acceleration = true && that.isSetAcceleration();
    if (this_present_Acceleration || that_present_Acceleration) {
      if (!(this_present_Acceleration && that_present_Acceleration))
        return false;
      if (!this.Acceleration.equals(that.Acceleration))
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

    hashCode = hashCode * 8191 + ((isSetWeight()) ? 131071 : 524287);
    if (isSetWeight())
      hashCode = hashCode * 8191 + Weight.hashCode();

    hashCode = hashCode * 8191 + ((isSetVelocity()) ? 131071 : 524287);
    if (isSetVelocity())
      hashCode = hashCode * 8191 + Velocity.hashCode();

    hashCode = hashCode * 8191 + ((isSetAcceleration()) ? 131071 : 524287);
    if (isSetAcceleration())
      hashCode = hashCode * 8191 + Acceleration.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MPostureConstraint other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetWeight()).compareTo(other.isSetWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Weight, other.Weight);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVelocity()).compareTo(other.isSetVelocity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVelocity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Velocity, other.Velocity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAcceleration()).compareTo(other.isSetAcceleration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAcceleration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Acceleration, other.Acceleration);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MPostureConstraint(");
    boolean first = true;

    sb.append("Posture:");
    if (this.Posture == null) {
      sb.append("null");
    } else {
      sb.append(this.Posture);
    }
    first = false;
    if (isSetWeight()) {
      if (!first) sb.append(", ");
      sb.append("Weight:");
      if (this.Weight == null) {
        sb.append("null");
      } else {
        sb.append(this.Weight);
      }
      first = false;
    }
    if (isSetVelocity()) {
      if (!first) sb.append(", ");
      sb.append("Velocity:");
      if (this.Velocity == null) {
        sb.append("null");
      } else {
        sb.append(this.Velocity);
      }
      first = false;
    }
    if (isSetAcceleration()) {
      if (!first) sb.append(", ");
      sb.append("Acceleration:");
      if (this.Acceleration == null) {
        sb.append("null");
      } else {
        sb.append(this.Acceleration);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (Posture == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Posture' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MPostureConstraintStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MPostureConstraintStandardScheme getScheme() {
      return new MPostureConstraintStandardScheme();
    }
  }

  private static class MPostureConstraintStandardScheme extends org.apache.thrift.scheme.StandardScheme<MPostureConstraint> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MPostureConstraint struct) throws org.apache.thrift.TException {
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
              struct.Posture = new MMIStandard.MAvatarPosture();
              struct.Posture.read(iprot);
              struct.setPostureIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map112 = iprot.readMapBegin();
                struct.Weight = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
                @org.apache.thrift.annotation.Nullable MMIStandard.MJointType _key113;
                double _val114;
                for (int _i115 = 0; _i115 < _map112.size; ++_i115)
                {
                  _key113 = MMIStandard.MJointType.findByValue(iprot.readI32());
                  _val114 = iprot.readDouble();
                  if (_key113 != null)
                  {
                    struct.Weight.put(_key113, _val114);
                  }
                }
                iprot.readMapEnd();
              }
              struct.setWeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VELOCITY
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map116 = iprot.readMapBegin();
                struct.Velocity = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
                @org.apache.thrift.annotation.Nullable MMIStandard.MJointType _key117;
                double _val118;
                for (int _i119 = 0; _i119 < _map116.size; ++_i119)
                {
                  _key117 = MMIStandard.MJointType.findByValue(iprot.readI32());
                  _val118 = iprot.readDouble();
                  if (_key117 != null)
                  {
                    struct.Velocity.put(_key117, _val118);
                  }
                }
                iprot.readMapEnd();
              }
              struct.setVelocityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ACCELERATION
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map120 = iprot.readMapBegin();
                struct.Acceleration = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
                @org.apache.thrift.annotation.Nullable MMIStandard.MJointType _key121;
                double _val122;
                for (int _i123 = 0; _i123 < _map120.size; ++_i123)
                {
                  _key121 = MMIStandard.MJointType.findByValue(iprot.readI32());
                  _val122 = iprot.readDouble();
                  if (_key121 != null)
                  {
                    struct.Acceleration.put(_key121, _val122);
                  }
                }
                iprot.readMapEnd();
              }
              struct.setAccelerationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MPostureConstraint struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Posture != null) {
        oprot.writeFieldBegin(POSTURE_FIELD_DESC);
        struct.Posture.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.Weight != null) {
        if (struct.isSetWeight()) {
          oprot.writeFieldBegin(WEIGHT_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.DOUBLE, struct.Weight.size()));
            for (java.util.Map.Entry<MMIStandard.MJointType, java.lang.Double> _iter124 : struct.Weight.entrySet())
            {
              oprot.writeI32(_iter124.getKey().getValue());
              oprot.writeDouble(_iter124.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.Velocity != null) {
        if (struct.isSetVelocity()) {
          oprot.writeFieldBegin(VELOCITY_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.DOUBLE, struct.Velocity.size()));
            for (java.util.Map.Entry<MMIStandard.MJointType, java.lang.Double> _iter125 : struct.Velocity.entrySet())
            {
              oprot.writeI32(_iter125.getKey().getValue());
              oprot.writeDouble(_iter125.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.Acceleration != null) {
        if (struct.isSetAcceleration()) {
          oprot.writeFieldBegin(ACCELERATION_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.DOUBLE, struct.Acceleration.size()));
            for (java.util.Map.Entry<MMIStandard.MJointType, java.lang.Double> _iter126 : struct.Acceleration.entrySet())
            {
              oprot.writeI32(_iter126.getKey().getValue());
              oprot.writeDouble(_iter126.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MPostureConstraintTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MPostureConstraintTupleScheme getScheme() {
      return new MPostureConstraintTupleScheme();
    }
  }

  private static class MPostureConstraintTupleScheme extends org.apache.thrift.scheme.TupleScheme<MPostureConstraint> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MPostureConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.Posture.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetWeight()) {
        optionals.set(0);
      }
      if (struct.isSetVelocity()) {
        optionals.set(1);
      }
      if (struct.isSetAcceleration()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetWeight()) {
        {
          oprot.writeI32(struct.Weight.size());
          for (java.util.Map.Entry<MMIStandard.MJointType, java.lang.Double> _iter127 : struct.Weight.entrySet())
          {
            oprot.writeI32(_iter127.getKey().getValue());
            oprot.writeDouble(_iter127.getValue());
          }
        }
      }
      if (struct.isSetVelocity()) {
        {
          oprot.writeI32(struct.Velocity.size());
          for (java.util.Map.Entry<MMIStandard.MJointType, java.lang.Double> _iter128 : struct.Velocity.entrySet())
          {
            oprot.writeI32(_iter128.getKey().getValue());
            oprot.writeDouble(_iter128.getValue());
          }
        }
      }
      if (struct.isSetAcceleration()) {
        {
          oprot.writeI32(struct.Acceleration.size());
          for (java.util.Map.Entry<MMIStandard.MJointType, java.lang.Double> _iter129 : struct.Acceleration.entrySet())
          {
            oprot.writeI32(_iter129.getKey().getValue());
            oprot.writeDouble(_iter129.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MPostureConstraint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.Posture = new MMIStandard.MAvatarPosture();
      struct.Posture.read(iprot);
      struct.setPostureIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map130 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.Weight = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
          @org.apache.thrift.annotation.Nullable MMIStandard.MJointType _key131;
          double _val132;
          for (int _i133 = 0; _i133 < _map130.size; ++_i133)
          {
            _key131 = MMIStandard.MJointType.findByValue(iprot.readI32());
            _val132 = iprot.readDouble();
            if (_key131 != null)
            {
              struct.Weight.put(_key131, _val132);
            }
          }
        }
        struct.setWeightIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map134 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.Velocity = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
          @org.apache.thrift.annotation.Nullable MMIStandard.MJointType _key135;
          double _val136;
          for (int _i137 = 0; _i137 < _map134.size; ++_i137)
          {
            _key135 = MMIStandard.MJointType.findByValue(iprot.readI32());
            _val136 = iprot.readDouble();
            if (_key135 != null)
            {
              struct.Velocity.put(_key135, _val136);
            }
          }
        }
        struct.setVelocityIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map138 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.Acceleration = new java.util.EnumMap<MMIStandard.MJointType,java.lang.Double>(MMIStandard.MJointType.class);
          @org.apache.thrift.annotation.Nullable MMIStandard.MJointType _key139;
          double _val140;
          for (int _i141 = 0; _i141 < _map138.size; ++_i141)
          {
            _key139 = MMIStandard.MJointType.findByValue(iprot.readI32());
            _val140 = iprot.readDouble();
            if (_key139 != null)
            {
              struct.Acceleration.put(_key139, _val140);
            }
          }
        }
        struct.setAccelerationIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

