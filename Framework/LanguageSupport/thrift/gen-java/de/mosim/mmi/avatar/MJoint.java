/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package de.mosim.mmi.avatar;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-10-20")
public class MJoint implements org.apache.thrift.TBase<MJoint, MJoint._Fields>, java.io.Serializable, Cloneable, Comparable<MJoint> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MJoint");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("ID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("Type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("Position", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ROTATION_FIELD_DESC = new org.apache.thrift.protocol.TField("Rotation", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField CHANNELS_FIELD_DESC = new org.apache.thrift.protocol.TField("Channels", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField PARENT_FIELD_DESC = new org.apache.thrift.protocol.TField("Parent", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MJointStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MJointTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String ID; // required
  /**
   * 
   * @see MJointType
   */
  public @org.apache.thrift.annotation.Nullable MJointType Type; // required
  public @org.apache.thrift.annotation.Nullable de.mosim.mmi.math.MVector3 Position; // required
  public @org.apache.thrift.annotation.Nullable de.mosim.mmi.math.MQuaternion Rotation; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<MChannel> Channels; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String Parent; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "ID"),
    /**
     * 
     * @see MJointType
     */
    TYPE((short)2, "Type"),
    POSITION((short)3, "Position"),
    ROTATION((short)4, "Rotation"),
    CHANNELS((short)5, "Channels"),
    PARENT((short)6, "Parent");

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
        case 1: // ID
          return ID;
        case 2: // TYPE
          return TYPE;
        case 3: // POSITION
          return POSITION;
        case 4: // ROTATION
          return ROTATION;
        case 5: // CHANNELS
          return CHANNELS;
        case 6: // PARENT
          return PARENT;
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
  private static final _Fields optionals[] = {_Fields.CHANNELS,_Fields.PARENT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("ID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("Type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MJointType.class)));
    tmpMap.put(_Fields.POSITION, new org.apache.thrift.meta_data.FieldMetaData("Position", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, de.mosim.mmi.math.MVector3.class)));
    tmpMap.put(_Fields.ROTATION, new org.apache.thrift.meta_data.FieldMetaData("Rotation", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, de.mosim.mmi.math.MQuaternion.class)));
    tmpMap.put(_Fields.CHANNELS, new org.apache.thrift.meta_data.FieldMetaData("Channels", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MChannel.class))));
    tmpMap.put(_Fields.PARENT, new org.apache.thrift.meta_data.FieldMetaData("Parent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MJoint.class, metaDataMap);
  }

  public MJoint() {
  }

  public MJoint(
    java.lang.String ID,
    MJointType Type,
    de.mosim.mmi.math.MVector3 Position,
    de.mosim.mmi.math.MQuaternion Rotation)
  {
    this();
    this.ID = ID;
    this.Type = Type;
    this.Position = Position;
    this.Rotation = Rotation;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MJoint(MJoint other) {
    if (other.isSetID()) {
      this.ID = other.ID;
    }
    if (other.isSetType()) {
      this.Type = other.Type;
    }
    if (other.isSetPosition()) {
      this.Position = new de.mosim.mmi.math.MVector3(other.Position);
    }
    if (other.isSetRotation()) {
      this.Rotation = new de.mosim.mmi.math.MQuaternion(other.Rotation);
    }
    if (other.isSetChannels()) {
      java.util.List<MChannel> __this__Channels = new java.util.ArrayList<MChannel>(other.Channels.size());
      for (MChannel other_element : other.Channels) {
        __this__Channels.add(other_element);
      }
      this.Channels = __this__Channels;
    }
    if (other.isSetParent()) {
      this.Parent = other.Parent;
    }
  }

  public MJoint deepCopy() {
    return new MJoint(this);
  }

  @Override
  public void clear() {
    this.ID = null;
    this.Type = null;
    this.Position = null;
    this.Rotation = null;
    this.Channels = null;
    this.Parent = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getID() {
    return this.ID;
  }

  public MJoint setID(@org.apache.thrift.annotation.Nullable java.lang.String ID) {
    this.ID = ID;
    return this;
  }

  public void unsetID() {
    this.ID = null;
  }

  /** Returns true if field ID is set (has been assigned a value) and false otherwise */
  public boolean isSetID() {
    return this.ID != null;
  }

  public void setIDIsSet(boolean value) {
    if (!value) {
      this.ID = null;
    }
  }

  /**
   * 
   * @see MJointType
   */
  @org.apache.thrift.annotation.Nullable
  public MJointType getType() {
    return this.Type;
  }

  /**
   * 
   * @see MJointType
   */
  public MJoint setType(@org.apache.thrift.annotation.Nullable MJointType Type) {
    this.Type = Type;
    return this;
  }

  public void unsetType() {
    this.Type = null;
  }

  /** Returns true if field Type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.Type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.Type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public de.mosim.mmi.math.MVector3 getPosition() {
    return this.Position;
  }

  public MJoint setPosition(@org.apache.thrift.annotation.Nullable de.mosim.mmi.math.MVector3 Position) {
    this.Position = Position;
    return this;
  }

  public void unsetPosition() {
    this.Position = null;
  }

  /** Returns true if field Position is set (has been assigned a value) and false otherwise */
  public boolean isSetPosition() {
    return this.Position != null;
  }

  public void setPositionIsSet(boolean value) {
    if (!value) {
      this.Position = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public de.mosim.mmi.math.MQuaternion getRotation() {
    return this.Rotation;
  }

  public MJoint setRotation(@org.apache.thrift.annotation.Nullable de.mosim.mmi.math.MQuaternion Rotation) {
    this.Rotation = Rotation;
    return this;
  }

  public void unsetRotation() {
    this.Rotation = null;
  }

  /** Returns true if field Rotation is set (has been assigned a value) and false otherwise */
  public boolean isSetRotation() {
    return this.Rotation != null;
  }

  public void setRotationIsSet(boolean value) {
    if (!value) {
      this.Rotation = null;
    }
  }

  public int getChannelsSize() {
    return (this.Channels == null) ? 0 : this.Channels.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<MChannel> getChannelsIterator() {
    return (this.Channels == null) ? null : this.Channels.iterator();
  }

  public void addToChannels(MChannel elem) {
    if (this.Channels == null) {
      this.Channels = new java.util.ArrayList<MChannel>();
    }
    this.Channels.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<MChannel> getChannels() {
    return this.Channels;
  }

  public MJoint setChannels(@org.apache.thrift.annotation.Nullable java.util.List<MChannel> Channels) {
    this.Channels = Channels;
    return this;
  }

  public void unsetChannels() {
    this.Channels = null;
  }

  /** Returns true if field Channels is set (has been assigned a value) and false otherwise */
  public boolean isSetChannels() {
    return this.Channels != null;
  }

  public void setChannelsIsSet(boolean value) {
    if (!value) {
      this.Channels = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getParent() {
    return this.Parent;
  }

  public MJoint setParent(@org.apache.thrift.annotation.Nullable java.lang.String Parent) {
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

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetID();
      } else {
        setID((java.lang.String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((MJointType)value);
      }
      break;

    case POSITION:
      if (value == null) {
        unsetPosition();
      } else {
        setPosition((de.mosim.mmi.math.MVector3)value);
      }
      break;

    case ROTATION:
      if (value == null) {
        unsetRotation();
      } else {
        setRotation((de.mosim.mmi.math.MQuaternion)value);
      }
      break;

    case CHANNELS:
      if (value == null) {
        unsetChannels();
      } else {
        setChannels((java.util.List<MChannel>)value);
      }
      break;

    case PARENT:
      if (value == null) {
        unsetParent();
      } else {
        setParent((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getID();

    case TYPE:
      return getType();

    case POSITION:
      return getPosition();

    case ROTATION:
      return getRotation();

    case CHANNELS:
      return getChannels();

    case PARENT:
      return getParent();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetID();
    case TYPE:
      return isSetType();
    case POSITION:
      return isSetPosition();
    case ROTATION:
      return isSetRotation();
    case CHANNELS:
      return isSetChannels();
    case PARENT:
      return isSetParent();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MJoint)
      return this.equals((MJoint)that);
    return false;
  }

  public boolean equals(MJoint that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ID = true && this.isSetID();
    boolean that_present_ID = true && that.isSetID();
    if (this_present_ID || that_present_ID) {
      if (!(this_present_ID && that_present_ID))
        return false;
      if (!this.ID.equals(that.ID))
        return false;
    }

    boolean this_present_Type = true && this.isSetType();
    boolean that_present_Type = true && that.isSetType();
    if (this_present_Type || that_present_Type) {
      if (!(this_present_Type && that_present_Type))
        return false;
      if (!this.Type.equals(that.Type))
        return false;
    }

    boolean this_present_Position = true && this.isSetPosition();
    boolean that_present_Position = true && that.isSetPosition();
    if (this_present_Position || that_present_Position) {
      if (!(this_present_Position && that_present_Position))
        return false;
      if (!this.Position.equals(that.Position))
        return false;
    }

    boolean this_present_Rotation = true && this.isSetRotation();
    boolean that_present_Rotation = true && that.isSetRotation();
    if (this_present_Rotation || that_present_Rotation) {
      if (!(this_present_Rotation && that_present_Rotation))
        return false;
      if (!this.Rotation.equals(that.Rotation))
        return false;
    }

    boolean this_present_Channels = true && this.isSetChannels();
    boolean that_present_Channels = true && that.isSetChannels();
    if (this_present_Channels || that_present_Channels) {
      if (!(this_present_Channels && that_present_Channels))
        return false;
      if (!this.Channels.equals(that.Channels))
        return false;
    }

    boolean this_present_Parent = true && this.isSetParent();
    boolean that_present_Parent = true && that.isSetParent();
    if (this_present_Parent || that_present_Parent) {
      if (!(this_present_Parent && that_present_Parent))
        return false;
      if (!this.Parent.equals(that.Parent))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetID()) ? 131071 : 524287);
    if (isSetID())
      hashCode = hashCode * 8191 + ID.hashCode();

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + Type.getValue();

    hashCode = hashCode * 8191 + ((isSetPosition()) ? 131071 : 524287);
    if (isSetPosition())
      hashCode = hashCode * 8191 + Position.hashCode();

    hashCode = hashCode * 8191 + ((isSetRotation()) ? 131071 : 524287);
    if (isSetRotation())
      hashCode = hashCode * 8191 + Rotation.hashCode();

    hashCode = hashCode * 8191 + ((isSetChannels()) ? 131071 : 524287);
    if (isSetChannels())
      hashCode = hashCode * 8191 + Channels.hashCode();

    hashCode = hashCode * 8191 + ((isSetParent()) ? 131071 : 524287);
    if (isSetParent())
      hashCode = hashCode * 8191 + Parent.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MJoint other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetID()).compareTo(other.isSetID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ID, other.ID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Type, other.Type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPosition()).compareTo(other.isSetPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Position, other.Position);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRotation()).compareTo(other.isSetRotation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRotation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Rotation, other.Rotation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetChannels()).compareTo(other.isSetChannels());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannels()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Channels, other.Channels);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MJoint(");
    boolean first = true;

    sb.append("ID:");
    if (this.ID == null) {
      sb.append("null");
    } else {
      sb.append(this.ID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Type:");
    if (this.Type == null) {
      sb.append("null");
    } else {
      sb.append(this.Type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Position:");
    if (this.Position == null) {
      sb.append("null");
    } else {
      sb.append(this.Position);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Rotation:");
    if (this.Rotation == null) {
      sb.append("null");
    } else {
      sb.append(this.Rotation);
    }
    first = false;
    if (isSetChannels()) {
      if (!first) sb.append(", ");
      sb.append("Channels:");
      if (this.Channels == null) {
        sb.append("null");
      } else {
        sb.append(this.Channels);
      }
      first = false;
    }
    if (isSetParent()) {
      if (!first) sb.append(", ");
      sb.append("Parent:");
      if (this.Parent == null) {
        sb.append("null");
      } else {
        sb.append(this.Parent);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (ID == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ID' was not present! Struct: " + toString());
    }
    if (Type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Type' was not present! Struct: " + toString());
    }
    if (Position == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Position' was not present! Struct: " + toString());
    }
    if (Rotation == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Rotation' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (Position != null) {
      Position.validate();
    }
    if (Rotation != null) {
      Rotation.validate();
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

  private static class MJointStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MJointStandardScheme getScheme() {
      return new MJointStandardScheme();
    }
  }

  private static class MJointStandardScheme extends org.apache.thrift.scheme.StandardScheme<MJoint> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MJoint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ID = iprot.readString();
              struct.setIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.Type = de.mosim.mmi.avatar.MJointType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.Position = new de.mosim.mmi.math.MVector3();
              struct.Position.read(iprot);
              struct.setPositionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROTATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.Rotation = new de.mosim.mmi.math.MQuaternion();
              struct.Rotation.read(iprot);
              struct.setRotationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CHANNELS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.Channels = new java.util.ArrayList<MChannel>(_list16.size);
                @org.apache.thrift.annotation.Nullable MChannel _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = de.mosim.mmi.avatar.MChannel.findByValue(iprot.readI32());
                  if (_elem17 != null)
                  {
                    struct.Channels.add(_elem17);
                  }
                }
                iprot.readListEnd();
              }
              struct.setChannelsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PARENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Parent = iprot.readString();
              struct.setParentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MJoint struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ID != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.ID);
        oprot.writeFieldEnd();
      }
      if (struct.Type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.Type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.Position != null) {
        oprot.writeFieldBegin(POSITION_FIELD_DESC);
        struct.Position.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.Rotation != null) {
        oprot.writeFieldBegin(ROTATION_FIELD_DESC);
        struct.Rotation.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.Channels != null) {
        if (struct.isSetChannels()) {
          oprot.writeFieldBegin(CHANNELS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.Channels.size()));
            for (MChannel _iter19 : struct.Channels)
            {
              oprot.writeI32(_iter19.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.Parent != null) {
        if (struct.isSetParent()) {
          oprot.writeFieldBegin(PARENT_FIELD_DESC);
          oprot.writeString(struct.Parent);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MJointTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MJointTupleScheme getScheme() {
      return new MJointTupleScheme();
    }
  }

  private static class MJointTupleScheme extends org.apache.thrift.scheme.TupleScheme<MJoint> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MJoint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.ID);
      oprot.writeI32(struct.Type.getValue());
      struct.Position.write(oprot);
      struct.Rotation.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetChannels()) {
        optionals.set(0);
      }
      if (struct.isSetParent()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetChannels()) {
        {
          oprot.writeI32(struct.Channels.size());
          for (MChannel _iter20 : struct.Channels)
          {
            oprot.writeI32(_iter20.getValue());
          }
        }
      }
      if (struct.isSetParent()) {
        oprot.writeString(struct.Parent);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MJoint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.ID = iprot.readString();
      struct.setIDIsSet(true);
      struct.Type = de.mosim.mmi.avatar.MJointType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      struct.Position = new de.mosim.mmi.math.MVector3();
      struct.Position.read(iprot);
      struct.setPositionIsSet(true);
      struct.Rotation = new de.mosim.mmi.math.MQuaternion();
      struct.Rotation.read(iprot);
      struct.setRotationIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.Channels = new java.util.ArrayList<MChannel>(_list21.size);
          @org.apache.thrift.annotation.Nullable MChannel _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = de.mosim.mmi.avatar.MChannel.findByValue(iprot.readI32());
            if (_elem22 != null)
            {
              struct.Channels.add(_elem22);
            }
          }
        }
        struct.setChannelsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.Parent = iprot.readString();
        struct.setParentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
