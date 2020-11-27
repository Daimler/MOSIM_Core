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

class MRetargetingService_SetupRetargeting_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'globalTarget',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\MAvatarPosture',
        ),
    );

    /**
     * @var \MAvatarPosture
     */
    public $globalTarget = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['globalTarget'])) {
                $this->globalTarget = $vals['globalTarget'];
            }
        }
    }

    public function getName()
    {
        return 'MRetargetingService_SetupRetargeting_args';
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
                    if ($ftype == TType::STRUCT) {
                        $this->globalTarget = new \MAvatarPosture();
                        $xfer += $this->globalTarget->read($input);
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
        $xfer += $output->writeStructBegin('MRetargetingService_SetupRetargeting_args');
        if ($this->globalTarget !== null) {
            if (!is_object($this->globalTarget)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('globalTarget', TType::STRUCT, 1);
            $xfer += $this->globalTarget->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}