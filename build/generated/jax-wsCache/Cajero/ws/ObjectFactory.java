
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Depositar_QNAME = new QName("http://ws/", "depositar");
    private final static QName _DepositarResponse_QNAME = new QName("http://ws/", "depositarResponse");
    private final static QName _Login_QNAME = new QName("http://ws/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "loginResponse");
    private final static QName _Registro_QNAME = new QName("http://ws/", "registro");
    private final static QName _RegistroResponse_QNAME = new QName("http://ws/", "registroResponse");
    private final static QName _Retirar_QNAME = new QName("http://ws/", "retirar");
    private final static QName _RetirarResponse_QNAME = new QName("http://ws/", "retirarResponse");
    private final static QName _Saldo_QNAME = new QName("http://ws/", "saldo");
    private final static QName _SaldoResponse_QNAME = new QName("http://ws/", "saldoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Depositar }
     * 
     */
    public Depositar createDepositar() {
        return new Depositar();
    }

    /**
     * Create an instance of {@link DepositarResponse }
     * 
     */
    public DepositarResponse createDepositarResponse() {
        return new DepositarResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Registro }
     * 
     */
    public Registro createRegistro() {
        return new Registro();
    }

    /**
     * Create an instance of {@link RegistroResponse }
     * 
     */
    public RegistroResponse createRegistroResponse() {
        return new RegistroResponse();
    }

    /**
     * Create an instance of {@link Retirar }
     * 
     */
    public Retirar createRetirar() {
        return new Retirar();
    }

    /**
     * Create an instance of {@link RetirarResponse }
     * 
     */
    public RetirarResponse createRetirarResponse() {
        return new RetirarResponse();
    }

    /**
     * Create an instance of {@link Saldo }
     * 
     */
    public Saldo createSaldo() {
        return new Saldo();
    }

    /**
     * Create an instance of {@link SaldoResponse }
     * 
     */
    public SaldoResponse createSaldoResponse() {
        return new SaldoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Depositar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Depositar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "depositar")
    public JAXBElement<Depositar> createDepositar(Depositar value) {
        return new JAXBElement<Depositar>(_Depositar_QNAME, Depositar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DepositarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "depositarResponse")
    public JAXBElement<DepositarResponse> createDepositarResponse(DepositarResponse value) {
        return new JAXBElement<DepositarResponse>(_DepositarResponse_QNAME, DepositarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registro }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registro")
    public JAXBElement<Registro> createRegistro(Registro value) {
        return new JAXBElement<Registro>(_Registro_QNAME, Registro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registroResponse")
    public JAXBElement<RegistroResponse> createRegistroResponse(RegistroResponse value) {
        return new JAXBElement<RegistroResponse>(_RegistroResponse_QNAME, RegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retirar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Retirar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "retirar")
    public JAXBElement<Retirar> createRetirar(Retirar value) {
        return new JAXBElement<Retirar>(_Retirar_QNAME, Retirar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetirarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "retirarResponse")
    public JAXBElement<RetirarResponse> createRetirarResponse(RetirarResponse value) {
        return new JAXBElement<RetirarResponse>(_RetirarResponse_QNAME, RetirarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Saldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saldo")
    public JAXBElement<Saldo> createSaldo(Saldo value) {
        return new JAXBElement<Saldo>(_Saldo_QNAME, Saldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saldoResponse")
    public JAXBElement<SaldoResponse> createSaldoResponse(SaldoResponse value) {
        return new JAXBElement<SaldoResponse>(_SaldoResponse_QNAME, SaldoResponse.class, null, value);
    }

}
