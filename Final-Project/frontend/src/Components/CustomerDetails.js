import React from 'react';

function CustomerDetails() {
  return (
    <div className="container">
      <header className="text-center mt-5">
        <h1>Welcome to Our Website</h1>
      </header>

      <nav className="mt-4">
        <ul className="nav justify-content-center">
          <li className="nav-item">
            <a className="nav-link" href="#medication">
              Medication
            </a>
          </li>
          <li className="nav-item">
            <a className="nav-link" href="#walking">
              Walking
            </a>
          </li>
          <li className="nav-item">
            <a className="nav-link" href="#reading">
              Reading
            </a>
          </li>
          <li className="nav-item">
            <a className="nav-link" href="#social">
              Social
            </a>
          </li>
        </ul>
      </nav>

      <section id="medication" className="mt-5">
        <h2 className="text-center">Medication</h2>
        <p className="text-center">
          Learn about the importance of medication and how it can help improve your health.
        </p>
      </section>

      <section id="walking" className="mt-5">
        <h2 className="text-center">Walking</h2>
        <p className="text-center">
          Discover the benefits of walking and how it can contribute to your overall well-being.
        </p>
      </section>

      <section id="reading" className="mt-5">
        <h2 className="text-center">Reading</h2>
        <p className="text-center">
          Explore the joy of reading and its positive impact on mental stimulation and relaxation.
        </p>
      </section>

      <section id="social" className="mt-5">
        <h2 className="text-center">Social Gathering</h2>
        <p className="text-center">
          Engage in social gatherings and build meaningful connections with others in your community.
        </p>
      </section>

      <footer className="text-center mt-5">
        <p>&copy; 2023 Our Website. All rights reserved.</p>
      </footer>

      <style jsx>{`
        header {
          background-color: #f8f9fa;
          padding: 20px;
        }

        nav {
          background-color: #e9ecef;
          padding: 10px;
        }

        nav .nav-item {
          margin-right: 10px;
        }

        section {
          background-color: #fff;
          padding: 20px;
        }

        footer {
          background-color: #e9ecef;
          padding: 10px;
        }
      `}</style>
    </div>
  );
}

export default CustomerDetails;
