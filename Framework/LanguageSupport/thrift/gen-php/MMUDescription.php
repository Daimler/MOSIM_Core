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

class MMUDescription
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'Name',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'ID',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'AssemblyName',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'MotionType',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        6 => array(
            'var' => 'Language',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        7 => array(
            'var' => 'Author',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        8 => array(
            'var' => 'Version',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        9 => array(
            'var' => 'Prerequisites',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\MConstraint',
                ),
        ),
        11 => array(
            'var' => 'Properties',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
        12 => array(
            'var' => 'Dependencies',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\MDependency',
                ),
        ),
        13 => array(
            'var' => 'Events',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
        14 => array(
            'var' => 'LongDescription',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        15 => array(
            'var' => 'ShortDescription',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        16 => array(
            'var' => 'Parameters',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\MParameter',
                ),
        ),
        17 => array(
            'var' => 'SceneParameters',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\MParameter',
                ),
        ),
        18 => array(
            'var' => 'Vendor',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        19 => array(
            'var' => 'VendorDomain',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        20 => array(
            'var' => 'MmuUrl',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        21 => array(
            'var' => 'UpdateUrl',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $Name = null;
    /**
     * @var string
     */
    public $ID = null;
    /**
     * @var string
     */
    public $AssemblyName = null;
    /**
     * @var string
     */
    public $MotionType = null;
    /**
     * @var string
     */
    public $Language = null;
    /**
     * @var string
     */
    public $Author = null;
    /**
     * @var string
     */
    public $Version = null;
    /**
     * @var \MConstraint[]
     */
    public $Prerequisites = null;
    /**
     * @var array
     */
    public $Properties = null;
    /**
     * @var \MDependency[]
     */
    public $Dependencies = null;
    /**
     * @var string[]
     */
    public $Events = null;
    /**
     * @var string
     */
    public $LongDescription = null;
    /**
     * @var string
     */
    public $ShortDescription = null;
    /**
     * @var \MParameter[]
     */
    public $Parameters = null;
    /**
     * @var \MParameter[]
     */
    public $SceneParameters = null;
    /**
     * @var string
     */
    public $Vendor = null;
    /**
     * @var string
     */
    public $VendorDomain = null;
    /**
     * @var string
     */
    public $MmuUrl = null;
    /**
     * @var string
     */
    public $UpdateUrl = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['Name'])) {
                $this->Name = $vals['Name'];
            }
            if (isset($vals['ID'])) {
                $this->ID = $vals['ID'];
            }
            if (isset($vals['AssemblyName'])) {
                $this->AssemblyName = $vals['AssemblyName'];
            }
            if (isset($vals['MotionType'])) {
                $this->MotionType = $vals['MotionType'];
            }
            if (isset($vals['Language'])) {
                $this->Language = $vals['Language'];
            }
            if (isset($vals['Author'])) {
                $this->Author = $vals['Author'];
            }
            if (isset($vals['Version'])) {
                $this->Version = $vals['Version'];
            }
            if (isset($vals['Prerequisites'])) {
                $this->Prerequisites = $vals['Prerequisites'];
            }
            if (isset($vals['Properties'])) {
                $this->Properties = $vals['Properties'];
            }
            if (isset($vals['Dependencies'])) {
                $this->Dependencies = $vals['Dependencies'];
            }
            if (isset($vals['Events'])) {
                $this->Events = $vals['Events'];
            }
            if (isset($vals['LongDescription'])) {
                $this->LongDescription = $vals['LongDescription'];
            }
            if (isset($vals['ShortDescription'])) {
                $this->ShortDescription = $vals['ShortDescription'];
            }
            if (isset($vals['Parameters'])) {
                $this->Parameters = $vals['Parameters'];
            }
            if (isset($vals['SceneParameters'])) {
                $this->SceneParameters = $vals['SceneParameters'];
            }
            if (isset($vals['Vendor'])) {
                $this->Vendor = $vals['Vendor'];
            }
            if (isset($vals['VendorDomain'])) {
                $this->VendorDomain = $vals['VendorDomain'];
            }
            if (isset($vals['MmuUrl'])) {
                $this->MmuUrl = $vals['MmuUrl'];
            }
            if (isset($vals['UpdateUrl'])) {
                $this->UpdateUrl = $vals['UpdateUrl'];
            }
        }
    }

    public function getName()
    {
        return 'MMUDescription';
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
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->Name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->ID);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->AssemblyName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->MotionType);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->Language);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->Author);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->Version);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 9:
                    if ($ftype == TType::LST) {
                        $this->Prerequisites = array();
                        $_size72 = 0;
                        $_etype75 = 0;
                        $xfer += $input->readListBegin($_etype75, $_size72);
                        for ($_i76 = 0; $_i76 < $_size72; ++$_i76) {
                            $elem77 = null;
                            $elem77 = new \MConstraint();
                            $xfer += $elem77->read($input);
                            $this->Prerequisites []= $elem77;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 11:
                    if ($ftype == TType::MAP) {
                        $this->Properties = array();
                        $_size78 = 0;
                        $_ktype79 = 0;
                        $_vtype80 = 0;
                        $xfer += $input->readMapBegin($_ktype79, $_vtype80, $_size78);
                        for ($_i82 = 0; $_i82 < $_size78; ++$_i82) {
                            $key83 = '';
                            $val84 = '';
                            $xfer += $input->readString($key83);
                            $xfer += $input->readString($val84);
                            $this->Properties[$key83] = $val84;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 12:
                    if ($ftype == TType::LST) {
                        $this->Dependencies = array();
                        $_size85 = 0;
                        $_etype88 = 0;
                        $xfer += $input->readListBegin($_etype88, $_size85);
                        for ($_i89 = 0; $_i89 < $_size85; ++$_i89) {
                            $elem90 = null;
                            $elem90 = new \MDependency();
                            $xfer += $elem90->read($input);
                            $this->Dependencies []= $elem90;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 13:
                    if ($ftype == TType::LST) {
                        $this->Events = array();
                        $_size91 = 0;
                        $_etype94 = 0;
                        $xfer += $input->readListBegin($_etype94, $_size91);
                        for ($_i95 = 0; $_i95 < $_size91; ++$_i95) {
                            $elem96 = null;
                            $xfer += $input->readString($elem96);
                            $this->Events []= $elem96;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 14:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->LongDescription);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 15:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->ShortDescription);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 16:
                    if ($ftype == TType::LST) {
                        $this->Parameters = array();
                        $_size97 = 0;
                        $_etype100 = 0;
                        $xfer += $input->readListBegin($_etype100, $_size97);
                        for ($_i101 = 0; $_i101 < $_size97; ++$_i101) {
                            $elem102 = null;
                            $elem102 = new \MParameter();
                            $xfer += $elem102->read($input);
                            $this->Parameters []= $elem102;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 17:
                    if ($ftype == TType::LST) {
                        $this->SceneParameters = array();
                        $_size103 = 0;
                        $_etype106 = 0;
                        $xfer += $input->readListBegin($_etype106, $_size103);
                        for ($_i107 = 0; $_i107 < $_size103; ++$_i107) {
                            $elem108 = null;
                            $elem108 = new \MParameter();
                            $xfer += $elem108->read($input);
                            $this->SceneParameters []= $elem108;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 18:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->Vendor);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 19:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->VendorDomain);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 20:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->MmuUrl);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 21:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->UpdateUrl);
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
        $xfer += $output->writeStructBegin('MMUDescription');
        if ($this->Name !== null) {
            $xfer += $output->writeFieldBegin('Name', TType::STRING, 1);
            $xfer += $output->writeString($this->Name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->ID !== null) {
            $xfer += $output->writeFieldBegin('ID', TType::STRING, 2);
            $xfer += $output->writeString($this->ID);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->AssemblyName !== null) {
            $xfer += $output->writeFieldBegin('AssemblyName', TType::STRING, 3);
            $xfer += $output->writeString($this->AssemblyName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->MotionType !== null) {
            $xfer += $output->writeFieldBegin('MotionType', TType::STRING, 4);
            $xfer += $output->writeString($this->MotionType);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Language !== null) {
            $xfer += $output->writeFieldBegin('Language', TType::STRING, 6);
            $xfer += $output->writeString($this->Language);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Author !== null) {
            $xfer += $output->writeFieldBegin('Author', TType::STRING, 7);
            $xfer += $output->writeString($this->Author);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Version !== null) {
            $xfer += $output->writeFieldBegin('Version', TType::STRING, 8);
            $xfer += $output->writeString($this->Version);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Prerequisites !== null) {
            if (!is_array($this->Prerequisites)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Prerequisites', TType::LST, 9);
            $output->writeListBegin(TType::STRUCT, count($this->Prerequisites));
            foreach ($this->Prerequisites as $iter109) {
                $xfer += $iter109->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Properties !== null) {
            if (!is_array($this->Properties)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Properties', TType::MAP, 11);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->Properties));
            foreach ($this->Properties as $kiter110 => $viter111) {
                $xfer += $output->writeString($kiter110);
                $xfer += $output->writeString($viter111);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Dependencies !== null) {
            if (!is_array($this->Dependencies)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Dependencies', TType::LST, 12);
            $output->writeListBegin(TType::STRUCT, count($this->Dependencies));
            foreach ($this->Dependencies as $iter112) {
                $xfer += $iter112->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Events !== null) {
            if (!is_array($this->Events)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Events', TType::LST, 13);
            $output->writeListBegin(TType::STRING, count($this->Events));
            foreach ($this->Events as $iter113) {
                $xfer += $output->writeString($iter113);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->LongDescription !== null) {
            $xfer += $output->writeFieldBegin('LongDescription', TType::STRING, 14);
            $xfer += $output->writeString($this->LongDescription);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->ShortDescription !== null) {
            $xfer += $output->writeFieldBegin('ShortDescription', TType::STRING, 15);
            $xfer += $output->writeString($this->ShortDescription);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Parameters !== null) {
            if (!is_array($this->Parameters)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('Parameters', TType::LST, 16);
            $output->writeListBegin(TType::STRUCT, count($this->Parameters));
            foreach ($this->Parameters as $iter114) {
                $xfer += $iter114->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->SceneParameters !== null) {
            if (!is_array($this->SceneParameters)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('SceneParameters', TType::LST, 17);
            $output->writeListBegin(TType::STRUCT, count($this->SceneParameters));
            foreach ($this->SceneParameters as $iter115) {
                $xfer += $iter115->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->Vendor !== null) {
            $xfer += $output->writeFieldBegin('Vendor', TType::STRING, 18);
            $xfer += $output->writeString($this->Vendor);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->VendorDomain !== null) {
            $xfer += $output->writeFieldBegin('VendorDomain', TType::STRING, 19);
            $xfer += $output->writeString($this->VendorDomain);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->MmuUrl !== null) {
            $xfer += $output->writeFieldBegin('MmuUrl', TType::STRING, 20);
            $xfer += $output->writeString($this->MmuUrl);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->UpdateUrl !== null) {
            $xfer += $output->writeFieldBegin('UpdateUrl', TType::STRING, 21);
            $xfer += $output->writeString($this->UpdateUrl);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
