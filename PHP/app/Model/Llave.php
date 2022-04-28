<?php

namespace App\Model;

class Llave
{
    public $color = "";

    public $tamanio = "";

    public $marca= "";

    public $funcion= "";

    public function __construct($col, $tam, $mar, $fun)
    {
        $this->establecerColor($col);
        $this->establecerTamanio($tam);
        $this->establecerMarca($mar);
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