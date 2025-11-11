import { BrowserRouter, Route, Routes } from "react-router-dom";
import ListadoEmpleados from "./empleados/ListadoEmpleados";
import Navegacion from "./plantilla/Navegacion";
import AgregarEmpleado from "./empleados/AgregarEmpleado";
import EditarEmpleado from "./empleados/EditarEmpleado";

function App() {
  return (
    <div className="container">
      <BrowserRouter> {/*Contenedor de navegacion*/}
        <Navegacion />{/*Incluimos el componente principal de navegación*/}
        <Routes>{/*Definidor de rutas de la aplicacion*/}
          <Route exact path="/" element={<ListadoEmpleados />}/>
          <Route exact path="/agregar" element={<AgregarEmpleado/>}/>
          <Route exact path="/editar/:id" element={<EditarEmpleado/>}/>
        </Routes>
        
      </BrowserRouter>

    </div>

    /* <div className="container text-center">
      <h3>Sistema de Recursos Humanos</h3>
    </div> */
  );
}

export default App;
