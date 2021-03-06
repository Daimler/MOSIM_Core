<?php
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class MMeshColliderProperties
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'Vertices',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\MVector3',
                ),
        ),
        2 => array(
            'var' => 'Triangles',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                ),
        ),
    );

    /**
     * @var \MVector3[]
     */
    public $Vertices = null;
    /**
     * @var int[]
     */
    public $Triangles = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['Vertices'])) {
                $this->Vertices = $vals['Vertices'];
            }
            if (isset($vals['Triangles'])) {
                $this->Triangles = $vals['Triangles'];
            }
        }
    }

    public function getName()
    {
        return 'MMeshColliderProperties';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->Vertices = array();
                        $_size56 = 0;
                        $_etype59 = 0;
                        $xfer += $input->readListBegin($_etype59, $_size56);
                        for ($_i60 = 0; $_i60 < $_size56; ++$_i60) {
                            $elem61 = null;
                            $elem61 = new \MVector3();
                            $xfer += $elem61->read($input);
                            $this->Vertices []= $elem61;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->Triangles = array();
                        $_size62 = 0;
                        $_etype65 = 0;
                        $xfer += $input->readListBegin($_etype65, $_size62);
                        for ($_i66 = 0; $_i66 < $_size62; ++$_i66) {
                            $elem67 = null;
                            $xfer += $input->readI32($elem67);
                            $this->Triangles []= $elem67;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('MMeshColliderProperties');
        if ($this->Vertices !== null) {
            if (!is_array($this->Vertices)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Vertices', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->Vertices));
            foreach ($this->Vertices as $iter68) {
                $xfer += $iter68->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Triangles !== null) {
            if (!is_array($this->Triangles)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Triangles', TType::LST, 2);
            $output->writeListBegin(TType::I32, count($this->Triangles));
            foreach ($this->Triangles as $iter69) {
                $xfer += $output->writeI32($iter69);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
