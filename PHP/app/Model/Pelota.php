<?php

namespace App\Model;

class Pelota
{
    public $color= "";

    public $marca = "";
  
    public $tamanio= "";

    public $funcion= "";

    public function __construct($mar, $tam, $col, $fun)
    {
        $this->establecerMarca($mar);
        $this->establecerTamanio($tam);
        $this->establecerColor($col);
        $this->establecerFuncion($fun);
    }

    public function obtenerColor()
    {
        return $this->color;
    }

    public function establecerColor($col)
    {
        $this->color = $col;
    }

    public function obtenerTamanio()
    {
        return $this->tamanio;
    }

    public function establecerTamanio($tam)
    {
        $this->tamanio = $tam;
    }

    public function obtenerMarca()
    {
        return $this->marca;
    }

    public function establecerMarca($mar)
    {
        $this->marca = $mar;
    }

    public function obtenerFuncion()
    {
        return $this->funcion;
    }

    public function establecerFuncion($fun)
    {
        $this->funcion = $fun;
    }
}