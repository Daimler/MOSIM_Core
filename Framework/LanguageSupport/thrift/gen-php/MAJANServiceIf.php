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

interface MAJANServiceIf
{
    /**
     * @param string $name
     * @param string $template
     * @param \MRDFGraph $knowledge
     * @return string
     */
    public function CreateAgent($name, $template, \MRDFGraph $knowledge);
    /**
     * @param string $agentName
     * @return bool
     */
    public function DeleteAgent($agentName);
    /**
     * @param string $agentName
     * @param string $endpoint
     * @param \MRDFGraph $content
     * @return string
     */
    public function ExecuteAgent($agentName, $endpoint, \MRDFGraph $content);
    /**
     * @param string $actionID
     * @param int $answer
     */
    public function ReceiveAsync($actionID, $answer);
}