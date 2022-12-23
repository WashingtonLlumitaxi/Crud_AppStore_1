package com.example.AppStore_1.Utilitario;

import com.example.AppStore_1.Entity.Cliente;
import com.example.AppStore_1.Repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class Runner implements CommandLineRunner {

    //Instancia de las clases

    private final ProveedorRepos proveedorRepos;
    private  final ClienteRepos clienteRepos;

    public Runner(ProveedorRepos proveedorRepos, ClienteRepos clienteRepos) {
        this.proveedorRepos = proveedorRepos;
        this.clienteRepos = clienteRepos;
    }


    @Override
    public void run(String... args) throws Exception {
        /*Preveedor objPrev = new Preveedor();
        objPrev.setRuc("123456");
        objPrev.setRazonSocial("Jerry Puzma");
        objPrev.setFechaRegistro(new Date());
        objPrev.setSucursal("Principal");
        objPrev.setDescripcion("Vneta de zapatos");

        //this.proveedorRepos.save(objPrev);
        proveedorRepos.saveAll(Set.of(objPrev));*/

        //Ingreso Clientes
        /*
        Cliente objCli = new Cliente();
        objCli.setApellido("MONTALUISA");
        objCli.setCedula(666669999);
        objCli.setCorreo("viky6700@espoch");
        objCli.setDireccion("LATACUNGA");
        objCli.setNombre("VICTOR");
        objCli.setTelefono(151515);
        clienteRepos.saveAll(Set.of(objCli));
*/
        //

        //Buscar por Nombre  de cliente

        //Cliente objCli = ClienteRepos.findByName("Jerry");
        //Cliente cli_1 = ClienteRepos.findByName("JUAN");
//      ahorro cuentaA = cuentaArepository.findByName("pepe");
//      System.out.println(cuentaA.toString());

      //  System.out.println("INGRESE NOMBRE A BUSCAR");
      //  String nombreaux = "";
      //  String nombre;
      //  nombre = rs.next();
      //  List<Cliente> cli = this.clienteRepos.getBynombre(nombre);

      //  for (Cliente ci : cliente) {
      //      nombreaux = ci.getNombre();
     //       if (nombre.equals(nombreaux)) {
     //           System.out.println(cli.get(0).toString());
     //       } else {
      //          System.out.println("CLIENTE NO ENCONTRADO");
     //       }
     //   }



       // Cliente clienteA = new Cliente(5, 0202516174, "YANFRY", "MONTALUISA", "victor@gmail.com", "LATACUNGA", 1236548741);
       // clienteRepos.save(clienteA);



        //Eliminar por id
        //Cliente clCli = new Cliente(1);

        //this.clienteRepos.deleteById(2);


        //Listar Cliente
       // List<Cliente> cli = clienteRepos.findAll();
       // System.out.println(cli);



    }
}
