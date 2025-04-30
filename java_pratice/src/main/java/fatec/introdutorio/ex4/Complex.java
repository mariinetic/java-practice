package fatec.introdutorio.ex4;

public class Complex {
    private double real, imag;

    public Complex() { 
        this(0, 0); 
    }
    
    public Complex(double real) { 
        this(real, 0); 
    }
    
    public Complex(double real, double imag) { 
        this.real = real; 
        this.imag = imag; 
    }

    public double getReal() { return real; }
    public double getImag() { return imag; }

    public double modulus() { return Math.hypot(real, imag); }

    public double argument() { return Math.atan2(imag, real); }

    public Complex inverse() { return new Complex(-real, -imag); }

    public Complex add(Complex c) { 
        return new Complex(real + c.real, imag + c.imag); 
    }

    public Complex subtract(Complex c) { 
        return new Complex(real - c.real, imag - c.imag); 
    }

    public Complex multiply(Complex c) { 
        return new Complex(real * c.real - imag * c.imag, 
                           real * c.imag + imag * c.real); 
    }

    public Complex divide(Complex c) {
        double denom = c.real * c.real + c.imag * c.imag;
        return new Complex(
            (real * c.real + imag * c.imag) / denom, 
            (imag * c.real - real * c.imag) / denom
        );
    }

    @Override
    public String toString() { 
        return String.format("(%f, %f)", real, imag); 
    }
}
