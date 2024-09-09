## DOCUMENTACIÓN
### Día Lunes 26/08
- Versión de Android Studio: Jiraffe 22 -> Koala 24
- Versión de JAVA: 8 -> 17
- No funciona la librería aminography prime date picker. Se comentó en el Daily Detail, en el register y en el statistics. 
- SOLUCIONES -> Hacer la dependencia de forma local o por el otro lado buscar otra dependencia más nueva y cambiar la implementación

### Miércoles 28/08
- Target SDK(27) y Compile SDK(34) actualizados a API 35
- Error de api:10 cuando se trata de loggear con google -> SOLUCIONADO
- Error de null pointer exception cuando se trata de loguear con el formulario. (Crea el usuario en firebase auth pero no inicia la app)
 
### Viernes 28/08
- Manejo de error agregado a login
- Sigue apareciendo el bug de si te creas un usuario y luego te deslogueas y queres crear un usuario nuevo no te deja. Esto tiene que ver con las tablas locales de Treatment

### CÓMO ACTUALIZAR LA PÁGINA
- Hacer un push al repositorio de github en la rama master
- Entrar al droplet con el usuario root
- ir a ```cd ../var/www/html/Vue```
- Hacer un git pull de los cambios
- Buildear el Vue con “npm run build”
- Hacer un restart del nginx con “sudo systemctl restart nginx”
LISTO!!
NOTAS:
NUNCA HACER CAMBIOS DIRECTAMENTE EN EL LINUX
