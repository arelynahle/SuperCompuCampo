<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en-US">
<!--<![endif]-->
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">

<title>¡Alta exitosa!</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]> <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script> <![endif]-->

<link href='http://fonts.googleapis.com/css?family=Lato:300,400,400italic,700,700italic,900%7CPacifico' rel='stylesheet' type='text/css'>

<!-- Favicons -->
<link rel="shortcut icon" href="images/favicon.ico">

<link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css">
<link rel="stylesheet" href="style.css" type="text/css" media="all" />
<link rel="stylesheet" href="js/prettyphoto/css/prettyPhoto.css" type="text/css" media="all" />

</head>

<body>


<div id="main" class="wrap">

<header id="header-bar" class="wrap">
  
   <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="clearfix">
            <div id="logo"><a href="index.html"><img class="img-responsive" src="images/logo.png"/></a></div>
            
            <nav class="navbar navbar-custom" role="navigation">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#collapse-navigation"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
            </div>
            <div class="collapse navbar-collapse" id="collapse-navigation">
           <ul class="nav menu-nav">
              
                <li><a href="InstServlet?opcion=3">Mi Institucion</a></li>
                
                <li class="current_page_item"><a href="contact.html">Alta de Niños</a></li>
        
                
                 <li><a href="index.html">Salir</a></li>
            </ul>
            </div><!-- /.navbar-collapse -->
            
          </nav>
           
          </div><!--.clearfix-->
  
      </div><!--.col-md-12-->
    </div><!--.row-->
    </div><!--.container-->
  </header><!-- header-bar-->
  

<section class="page-top wrap">

	<h2 class="page-section-title">Alta Exitosa de Niño</h2>

</section><!-- page-top -->
  <div class="zz-bottom"></div>

<section class="page-content wrap">

<div class="container">

<div class="row">

<div class="col-sm-6 col-md-6">

<h3 class="widgettitle">Nuevo niño registrado en la institución</h3>

<h5>Aquí te presentamos los datos que introdujiste:</h5>

        <br>
        <h5>Niño</h5>        
        <table cellspacing="5" cellpadding="5" border="1">
            <tr>
                <td>Nombre</td>
                <td>${ninoTemp.nombre_nino}</td>
            </tr>
            <tr>
                <td>Apellido Paterno</td>
                <td>${ninoTemp.ap_nino}</td>
            </tr>
            <tr>
                <td>Apellido Materno</td>
                <td>${ninoTemp.am_nino}</td>
            </tr>
            <tr>
                <td>Edad</td>
                <td>${ninoTemp.edad_cron}</td>
            </tr>
        </table>    
        
        <br>    
        <h5>Playera</h5>
        <table cellspacing="5" cellpadding="5" border="1">   
            <tr>
                <td>Modelo Playera</td>
                <td>${ninoTemp.modeloplayera_nino}</td>
            </tr>
            <tr>
                <td>Talla Playera</td>
                <td>${ninoTemp.tallaplayera_nino}</td>
            </tr> 
        </table>
            
        <br>    
        <h5>Detalle</h5>
        <table cellspacing="5" cellpadding="5" border="1">   
            <tr>
                <td>Discapacidad</td>
                <td>${detTemp.discapacidad_det}</td>
            </tr>
            <tr>
                <td>Edad Mental</td>
                <td>${detTemp.edad_men_det}</td>
            </tr>
            <tr>
                <td>Escolaridad</td>
                <td>${detTemp.escolaridad_det}</td>
            </tr>
            <tr>
                <td>Tratamiento</td>
                <td>${detTemp.tratamiento_det}</td>
            </tr>    
            <tr>
                <td>Silla</td>
                <td>${detTemp.silla_det}</td>
            </tr> 
            <tr>
                <td>Hospital</td>
                <td>${conTemp.hospital_con}</td>
            </tr>
        </table>
            
        <br>    
        <h5>En Caso de Emergencia:</h5>
        <table cellspacing="5" cellpadding="5" border="1">   
            <tr>
                <td>Llamar a: </td>
                <td>${conTemp.parentesco_con}</td>
            </tr>              
            <tr>
                <td>Nombre Contacto: </td>
                <td>${conTemp.nombre_con}</td>
            </tr>    
            <tr>
                <td>Telefono Contacto: </td>
                <td>${conTemp.tel_con}</td>
            </tr>                
            <tr>
                <td>Celular Contacto: </td>
                <td>${conTemp.cel_con}</td>
            </tr>  
             <tr>
                <td>Oficina Contacto: </td>
                <td>${conTemp.of_con}</td>
            </tr>             
        </table>
       
        <br>    
       
        <a href="contact.html"><button>Registrar Otro Niño</button></a>

</div><!-- col-md-6-->

</div><!--row-->

</div><!-- container-->

</section><!-- page-content-->

<div class="zz-top-foo"></div>
<footer class="wrap">

<div class="copyright clearfix">

<div class="container">
<div class="row">
<div class="col-md-12">

<p>©2014 DAW- Arely, Rolando y Carlos</p>

<ul>
<li><a href="https://www.facebook.com/supercompucampo.itesm" target="_blank"><i class="fa fa-facebook"></i></a></li>
<li><a href="https://twitter.com/SuperCompucampo" target="_blank"><i class="fa fa-twitter"></i></a></li>
<!--<li><a href="#" target="_blank"><i class="fa fa-google-plus"></i></a></li>-->
<!--<li><a href="#" target="_blank"><i class="fa fa-linkedin"></i></a></li>-->
<!--<li><a href="#" target="_blank"><i class="fa fa-pinterest"></i></a></li>-->
<!--<li><a href="#" target="_blank"><i class="fa fa-youtube"></i></a></li>-->
<!--<li><a href="#" target="_blank"><i class="fa fa-vimeo-square"></i></a></li>-->
</ul>

</div><!-- col-md-12-->
</div><!-- row-->
</div><!-- container-->

</div><!-- copyright-->

</footer>

</div><!-- main -->

<div class="scrollup">
<a class="scrolltop" href="#">
<i class="fa fa-chevron-up"></i>
</a>
</div>


<script type='text/javascript' src='https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js'></script>
<script type='text/javascript' src='css/bootstrap/js/bootstrap.min.js'></script>
<script type='text/javascript' src='js/jquery.easing.min.js'></script>
<script type='text/javascript' src='js/jquery.flexslider-min.js'></script>
<script type='text/javascript' src='js/prettyphoto/js/jquery.prettyPhoto.js'></script>
<script type='text/javascript' src='js/jquery.form.min.js'></script>
<script type='text/javascript' src='js/init.js'></script>

</body>
</html>
