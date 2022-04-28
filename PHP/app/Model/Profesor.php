<?php

namespace App\Model;

class Profesor
{
    public $nombre= "";
  
    public $genero = "";

    public $curso = "";

    public $funcion= "";

    public function __construct($nom, $gen, $cur, $fun)
    {
        $this->establecerNombre($nom);
        $this->establecerGenero($gen);
        $this->establecerCurso($cur);
        $this->establecerFuncion($fun);
    }

    public function obtenerNombre()
    {
        return $this->nombre;
    }

    public function establecerNombre($nom)
    {
        $this->nombre = $nom;
    }

    public function obtenerGenero()
    {
        return $this->genero;
    }

    public function establecerGenero($gen)
    {
        $this->genero = $gen;
    }

    public function obtenerCurso()
    {
        return $this->curso;
    }

    public function establecerCurso($cur)
    {
        $this->curso = $cur;
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