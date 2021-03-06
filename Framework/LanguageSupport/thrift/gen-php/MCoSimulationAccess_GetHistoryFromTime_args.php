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

class MCoSimulationAccess_GetHistoryFromTime_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'startTime',
            'isRequired' => false,
            'type' => TType::DOUBLE,
        ),
        2 => array(
            'var' => 'endTime',
            'isRequired' => false,
            'type' => TType::DOUBLE,
        ),
        3 => array(
            'var' => 'eventType',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var double
     */
    public $startTime = null;
    /**
     * @var double
     */
    public $endTime = null;
    /**
     * @var string
     */
    public $eventType = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['startTime'])) {
                $this->startTime = $vals['startTime'];
            }
            if (isset($vals['endTime'])) {
                $this->endTime = $vals['endTime'];
            }
            if (isset($vals['eventType'])) {
                $this->eventType = $vals['eventType'];
            }
        }
    }

    public function getName()
    {
        return 'MCoSimulationAccess_GetHistoryFromTime_args';
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
                    if ($ftype == TType::DOUBLE) {
                        $xfer += $input->readDouble($this->startTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::DOUBLE) {
                        $xfer += $input->readDouble($this->endTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->eventType);
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
        $xfer += $output->writeStructBegin('MCoSimulationAccess_GetHistoryFromTime_args');
        if ($this->startTime !== null) {
            $xfer += $output->writeFieldBegin('startTime', TType::DOUBLE, 1);
            $xfer += $output->writeDouble($this->startTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->endTime !== null) {
            $xfer += $output->writeFieldBegin('endTime', TType::DOUBLE, 2);
            $xfer += $output->writeDouble($this->endTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->eventType !== null) {
            $xfer += $output->writeFieldBegin('eventType', TType::STRING, 3);
            $xfer += $output->writeString($this->eventType);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
