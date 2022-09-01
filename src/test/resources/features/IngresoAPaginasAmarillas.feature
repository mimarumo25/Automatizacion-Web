#Author: Miguel Rubide

@IngresoAPaginasAmarillas
Feature: Ingreso los datos a buscar, se valida que el resultado sea exitoso, se cambia de pagina y se completa el formulario
Scenario Outline: Realizar busqueda en Paginasamarilas.com y realizar registro.
    Given El Usuario Abre La App PaginasAmarillas.com
    Given Despues De Abrir La Pagina Se Ingresa Los Datos A Buscar 
    |<txt_Busqueda>|<txt_Ubicacion>|
    And Valida Que La Informacion Obtenida En La Busqueda Sea La Correcta
    |<lbl_Resultado>|
    When Cambia De Pagina Anunciate 
    
    And Carga La Informacion Solidada En El Formulario De Registro
    |<txt_Nombre>|<txt_email>|<txt_telefono>|<cbx_ciudad>||<chbx_terminos>|
    Then Validar El Resultado Del Registro Sea Exitoso 
    |<lbl_ResutaldoResgistro>|
  Examples:
   |txt_Busqueda|txt_Ubicacion|lbl_Resultado|txt_Nombre|txt_email|txt_telefono|cbx_ciudad|lbl_ResutaldoResgistro|
   |Choucair Testing|Medellin|Cr43 A 1 S-188 Of 701|Padro Antonio Palacios moreno|pedropalacios@gmail.com|3124566789|MEDELLIN|Gracias|

