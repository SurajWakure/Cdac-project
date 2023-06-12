import React from 'react';
import './HomePage.css';


function HomePage() {
  return (
    <div className="container">
      <header>
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
          <ul className="navbar-nav">
            <li className="nav-item">
              <a className="nav-link" href="/">Home</a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/service">Services</a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/doctors">Doctors</a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/contactus">Contact</a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/login">Login</a>
            </li>
          </ul>
        </nav>
      </header>

      <section className="hero-section">
        <div className="hero-content">
          <h1 className="display-4">Welcome to Our Healthcare Website</h1>
          <p className="lead">We provide high-quality healthcare services to improve your well-being.</p>
          <a href="/services" className="btn btn-primary">Discover Our Services</a>
        </div>
      </section>

      <section className="services-section">
        <h2 className="mb-4">Our Services</h2>
        <div className="row">
          <div className="col-md-4">
            <div className="card mb-4">
              <div className="card-body">
                <h3 className="card-title">Medical Checkups</h3>
                <p className="card-text">Comprehensive medical checkups for preventive care.</p>
              </div>
            </div>
          </div>
          <div className="col-md-4">
            <div className="card mb-4">
              <div className="card-body">
                <h3 className="card-title">Specialized Treatments</h3>
                <p className="card-text">Advanced treatments tailored to your specific needs.</p>
              </div>
            </div>
          </div>
          <div className="col-md-4">
            <div className="card mb-4">
              <div className="card-body">
                <h3 className="card-title">Emergency Care</h3>
                <p className="card-text">24/7 emergency care services for critical conditions.</p>
              </div>
            </div>
          </div>
        </div>
      </section>

      <section className="doctors-section">
        <h2 className="mb-4">Our Doctors</h2>
        <div className="row">
          <div className="col-md-4">
            <div className="card mb-4">
              <img src="https://media.istockphoto.com/id/1189304032/photo/doctor-holding-digital-tablet-at-meeting-room.jpg?s=612x612&w=0&k=20&c=RtQn8w_vhzGYbflSa1B5ea9Ji70O8wHpSgGBSh0anUg=" className="card-img-top" alt="Doctor 1" />
              <div className="card-body">
                <h3 className="card-title">Dr. Sarah Davis</h3>
                <p className="card-text">Specialist in Cardiology</p>
              </div>
            </div>
          </div>
        </div>
      </section>

      <footer>
        <p>&copy; 2023 Healthcare Website. All rights reserved.</p>
      </footer>
    </div>
  );
}

export default HomePage;
