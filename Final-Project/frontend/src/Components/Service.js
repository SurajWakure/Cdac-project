import React from 'react';

function Service() {
  return (
    <div className="container">
      <header>
        <nav>
          <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/service">Services</a></li>
            <li><a href="/doctors">Doctors</a></li>
            <li><a href="/contactus">Contact</a></li>
            <li><a href="/login">Login</a></li>
          </ul>
        </nav>
      </header>

      <section className="services-section">
        <h2>Our Services</h2>
        <p>Discover the range of services we offer to our patients.</p>
        <div className="services-list">
          <div className="service-card">
            <h3>Cardiology</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur sed leo a orci luctus condimentum.</p>
          </div>
          <div className="service-card">
            <h3>Dermatology</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur sed leo a orci luctus condimentum.</p>
          </div>
          <div className="service-card">
            <h3>Orthopedics</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur sed leo a orci luctus condimentum.</p>
          </div>
        </div>
      </section>

      <footer>
        <p>&copy; 2023 Healthcare Website. All rights reserved.</p>
      </footer>
    </div>
  );
}

export default Service;
