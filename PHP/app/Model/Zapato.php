<?php

namespace App\Model;

class Zapato
{
    public $color= "";

    public $marca = "";
  
    public $precio= "";

    public $funcion= "";

    public function __construct($mar, $pre, $col, $fun)
    {
        $this->establecerMarca($mar);
        $this->establecerPrecio($pre);
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

    public function obtenerPrecio()
    {
        return $this->precio;
    }

    public function establecerPrecio($pre)
    {
        $this->precio = $pre;
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