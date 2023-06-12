import logo from './logo.svg';
import './App.css';
import Registration from './Components/Registration';
import Login from './Components/Login';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import ContactUs from './Components/ContactUs';
import Service from './Components/Service';
import Doctor from './Components/Doctor';
import HomePage from './Components/HomePage';
import CustomerDetails from './Components/CustomerDetails';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Routes>
      <Route exact path="/register" element={<Registration />} />
        <Route path="/login" element={<Login />} />
        <Route path="/contactus" element={<ContactUs />} />
        <Route path="/service" element={<Service />} />
        <Route path="/doctors" element={<Doctor />} />
        <Route path="/details" element={<CustomerDetails/>} />
        <Route path="/" element={<HomePage/>} />
        
      </ Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
