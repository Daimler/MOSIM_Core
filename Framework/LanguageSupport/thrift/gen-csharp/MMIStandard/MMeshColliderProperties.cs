/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace MMIStandard
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class MMeshColliderProperties : TBase
  {

    public List<MMIStandard.MVector3> Vertices { get; set; }

    public List<int> Triangles { get; set; }

    public MMeshColliderProperties() {
    }

    public MMeshColliderProperties(List<MMIStandard.MVector3> Vertices, List<int> Triangles) : this() {
      this.Vertices = Vertices;
      this.Triangles = Triangles;
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        bool isset_Vertices = false;
        bool isset_Triangles = false;
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 1:
              if (field.Type == TType.List) {
                {
                  Vertices = new List<MMIStandard.MVector3>();
                  TList _list32 = iprot.ReadListBegin();
                  for( int _i33 = 0; _i33 < _list32.Count; ++_i33)
                  {
                    MMIStandard.MVector3 _elem34;
                    _elem34 = new MMIStandard.MVector3();
                    _elem34.Read(iprot);
                    Vertices.Add(_elem34);
                  }
                  iprot.ReadListEnd();
                }
                isset_Vertices = true;
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.List) {
                {
                  Triangles = new List<int>();
                  TList _list35 = iprot.ReadListBegin();
                  for( int _i36 = 0; _i36 < _list35.Count; ++_i36)
                  {
                    int _elem37;
                    _elem37 = iprot.ReadI32();
                    Triangles.Add(_elem37);
                  }
                  iprot.ReadListEnd();
                }
                isset_Triangles = true;
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
        if (!isset_Vertices)
          throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Vertices not set");
        if (!isset_Triangles)
          throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Triangles not set");
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("MMeshColliderProperties");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (Vertices == null)
          throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Vertices not set");
        field.Name = "Vertices";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Vertices.Count));
          foreach (MMIStandard.MVector3 _iter38 in Vertices)
          {
            _iter38.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
        if (Triangles == null)
          throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Triangles not set");
        field.Name = "Triangles";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.I32, Triangles.Count));
          foreach (int _iter39 in Triangles)
          {
            oprot.WriteI32(_iter39);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("MMeshColliderProperties(");
      __sb.Append(", Vertices: ");
      __sb.Append(Vertices);
      __sb.Append(", Triangles: ");
      __sb.Append(Triangles);
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}