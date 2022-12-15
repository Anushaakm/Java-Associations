package exception.com.xworkz.exception.exceptionalEvents;

import java.awt.AWTError;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.RasterFormatException;
import java.awt.print.PrinterAbortException;
import java.beans.PropertyVetoException;
import java.io.IOError;
import java.io.NotActiveException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URISyntaxException;
import java.net.UnknownServiceException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.sql.SQLSyntaxErrorException;
import java.text.ParseException;
import java.time.zone.ZoneRulesException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.TooManyListenersException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.ErrorManager;
import java.util.zip.ZipError;

import javax.lang.model.type.MirroredTypeException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMRuntimeException;
import javax.management.remote.JMXServerErrorException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.print.attribute.UnmodifiableSetException;
import javax.security.auth.DestroyFailedException;
import javax.security.sasl.AuthenticationException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.w3c.dom.DOMException;
import org.w3c.dom.ls.LSException;

public class Event {

	public void method1() {
		System.out.println("method1");
		throw new RuntimeException();
	}
	public void method2() {
		System.out.println("method2");
		throw new WrongMethodTypeException();
		method1();
	}
	public void method3() {
		System.out.println("method3");
		throw new UnsupportedOperationException();
	}
	public void method4() {
		System.out.println("method4");
		throw new UnmodifiableSetException();
	}
	public void method5() {
		System.out.println("method5");
		throw new UndeclaredThrowableException(null);
	}
	public void method6() {
		System.out.println("method6");
		throw new TypeNotPresentException(null, null);
	}
	public void method7() {
		System.out.println("method7");
		throw new SecurityException();
	}
	public void method8() {
		System.out.println("method8");
		throw new RejectedExecutionException();
	}
	public void method9() {
		System.out.println("method9");
		throw new RasterFormatException(null);
	}
	public void method10() {
		System.out.println("method10");
		throw new ProviderNotFoundException();
	}
	public void method11() {
		System.out.println("method11");
		throw new ProfileDataException(null);
	}
	public void method12() {
		System.out.println("method12");
		throw new NullPointerException();
	}
	public void method13() {
		System.out.println("method13");
		throw new NoSuchMechanismException();
	}
	public void method14() {
		System.out.println("method14");
		throw new NoSuchElementException();
	}
	public void method15() {
		System.out.println("method15");
		throw new NegativeArraySizeException();
	}
	public void method16() {
		System.out.println("method16");
		throw new MissingResourceException(null, null, null);
	}
	public void method17() {
		System.out.println("method17");
		throw new MirroredTypeException(null);
	}
	public void method18() {
		System.out.println("method18");
		throw new MalformedParameterizedTypeException();
	}
	public void method19() {
		System.out.println("method19");
		throw new LSException((short) 0, null);
	}
	public void method20() {
		System.out.println("method20");
		throw new JMRuntimeException();
	}
	public void method21() {
		System.out.println("method21");
		throw new IndexOutOfBoundsException();
	}
	public void method22() {
		System.out.println("method22");
		throw new IncompleteAnnotationException(null, null);
	}
	public void method23() {
		System.out.println("method23");
		throw new IllegalStateException();
	}
	public void method24() {
		System.out.println("method24");
		throw new IllegalPathStateException();
	}
	public void method25() {
		System.out.println("method25");
		throw new IllegalArgumentException();
	}
	public void method26() {
		System.out.println("method26");
		throw new FileSystemNotFoundException();
	}
	public void method27() {
		System.out.println("method27");
		throw new EnumConstantNotPresentException(null, null);
	}
	public void method28() {
		System.out.println("method28");
		throw new EmptyStackException();
	}
	public void method29() {
		System.out.println("method29");
		throw new DOMException((short) 0, null);
	}
	public void method30() {
		System.out.println("method30");
		throw new ConcurrentModificationException();
	}
	public void method31() {
		System.out.println("method31");
		throw new CMMException(null);
	}
	public void method32() {
		System.out.println("method32");
		throw new CannotRedoException();
	}
	public void method33() {
		System.out.println("method33");
		throw new BufferUnderflowException();
	}
	public void method34() {
		System.out.println("method34");
		throw new BufferOverflowException();
	}
	
	public void method35() {
		System.out.println("method35");
		throw new ArrayStoreException();
	}
	
	public void method36() {
		System.out.println("method36");
		throw new Error();
	}
	public void method37() {
		System.out.println("method1");
		throw new AbstractMethodError();
	}
	public void method38() {
		System.out.println("method1");
		throw new AssertionError();
	}
	public void method39() {
		System.out.println("method1");
		throw new AWTError(null);
	}
	public void method40() {
		System.out.println("method1");
		throw new CoderMalfunctionError(null);
	}
	public void method41() {
		System.out.println("method1");
		throw new FactoryConfigurationError();
	}
	public void method42() {
		System.out.println("method1");
		throw new IOError(null);
	}
	public void method43() {
		System.out.println("method1");
		throw new LinkageError();
	}
	public void method44() {
		System.out.println("method1");
		throw new ServiceConfigurationError(null);
	}
	public void method45() {
		System.out.println("method1");
		throw new ThreadDeath();
	}
	public void method46() {
		System.out.println("method1");
		throw new TransformerFactoryConfigurationError();
	}
	public void method47() {
		System.out.println("method1");
		throw new AbstractMethodError();
	}
	public void method48() {
		System.out.println("method1");
		throw new BootstrapMethodError();
	}
	public void method49() {
		System.out.println("method1");
		throw new ClassCircularityError();
	}
	public void method50() {
		System.out.println("method1");
		throw new ClassFormatError();
	}
	public void method51() {
		System.out.println("method1");
		throw new ExceptionInInitializerError();
	}
	public void method52() {
		System.out.println("method1");
		throw new IncompatibleClassChangeError();
	}
	public void method53() {
		System.out.println("method1");
		throw new NoClassDefFoundError();
	}
	public void method54() {
		System.out.println("method1");
		throw new UnsatisfiedLinkError();
		
		method53();
	}
	public void method55() {
		System.out.println("method1");
		throw new VerifyError();
	}
	public void method56() {
		System.out.println("method1");
		throw new GenericSignatureFormatError();
	}
	
	public void method57() {
		System.out.println("method1");
		throw new InstantiationError();
	}
	public void method58() {
		System.out.println("method1");
		throw new InternalError();
	}
	public void method59() {
		System.out.println("method1");
		throw new ZipError(null);
	}
	public void method60() {
		System.out.println("method1");
		throw new ServiceConfigurationError(null);
	}
	
	
	public void method61() throws Exception {
		System.out.println("running method61");
		throw new Exception();
	}
	public void method62() throws MidiUnavailableException {
		System.out.println("running method62");
		throw new MidiUnavailableException();
	}
	public void method63() throws AuthenticationException {
		System.out.println("running method63");
		throw new AuthenticationException();
	}

	public void method64() throws AlreadyBoundException {
		System.out.println("running method64");
		throw new AlreadyBoundException();
	}

	public void method65() throws InvalidApplicationException {
		System.out.println("running method65");
		throw new InvalidApplicationException(getClass());
	}

	public void method66() throws BadBinaryOpValueExpException {
		System.out.println("running method66");
		throw new BadBinaryOpValueExpException(null);
	}

	public void method67() throws BadLocationException {
		System.out.println("running method67");
		throw new BadLocationException(null, 0);
	}

	public void method68() throws BadStringOperationException {
		System.out.println("running method68");
		throw new BadStringOperationException(null);
	}

	public void method69() throws BadBinaryOpValueExpException {
		System.out.println("running method69");
		throw new BadBinaryOpValueExpException(null);
	}

	public void method70() throws BadLocationException {
		System.out.println("running method70");
		throw new BadLocationException(null, 0);
		
	}

	public void method71() throws DestroyFailedException {
		System.out.println("running method71");
		throw new DestroyFailedException();
		
	}

	public void method72() throws GeneralSecurityException {
		System.out.println("running method72");
		throw new GeneralSecurityException();
	}

	public void method73() throws DestroyFailedException {
		System.out.println("running method73");
		throw new DestroyFailedException();
	}

	public void method74() throws ExecutionException {
		System.out.println("running method74");
		throw new ExecutionException(null);
	}

	public void method75() throws FontFormatException {
		System.out.println("running method75");
		throw new FontFormatException(null);
	}

	public void method76() throws InvalidMidiDataException {
		System.out.println("running method76");
		throw new InvalidMidiDataException();
	}

	public void method77() throws ZoneRulesException {
		System.out.println("running method77");
		throw new ZoneRulesException(null, null);
	}
	

	public void method78() throws GeneralSecurityException {
		System.out.println("running method78");
		throw new GeneralSecurityException();
	}

	public void method79() throws GSSException {
		System.out.println("running method79");
		throw new GSSException(0);
	}

	
	public void method80() throws IllegalClassFormatException {
		System.out.println("running method80");
		throw new IllegalClassFormatException();
	}

	public void method81() throws UnknownServiceException {
		System.out.println("running method81");
		throw new UnknownServiceException();
	}

	public void method82() throws UserPrincipalNotFoundException {
		System.out.println("running method82");
		throw new UserPrincipalNotFoundException(null);
	}

	public void method83() throws URISyntaxException {
		System.out.println("running method83");
		throw new URISyntaxException(null, null);
	}

	public void method84() throws URIReferenceException {
		System.out.println("running method84");
		throw new URIReferenceException();
	}

	public void method85() throws PrivilegedActionException {
		System.out.println("running method85");
		throw new PrivilegedActionException(null);
	}

	public void method86() throws PropertyVetoException {
		System.out.println("running method86");
		throw new PropertyVetoException(null, null);
	}

	public void method87() throws MarshalException {
		System.out.println("running method87");
		throw new MarshalException(null);
	}

	public void method88() throws NotActiveException {
		System.out.println("running method88");
		throw new NotActiveException();
	
	}

	public void method89() throws NotBoundException, LineUnavailableException {
		System.out.println("running method89");
		method90();
		throw new NotBoundException();
		
	}

	public void method90() throws LineUnavailableException {
		System.out.println("running method90");
		throw new LineUnavailableException();
	}

	public void method91() throws ParseException {
		System.out.println("running method 91");
		throw new ParseException(null, 0);
	}

	public void method92() throws ParserConfigurationException {
		System.out.println("running method 92");
		throw new ParserConfigurationException(null);
	}

	public void method93() throws PrinterAbortException {
		System.out.println("running method 93");
		throw new PrinterAbortException();
	}

	public void method94() throws TransformerConfigurationException {
		System.out.println("running method 94");
		throw new TransformerConfigurationException();
		
	}

	public void method95() throws TooManyListenersException {
		System.out.println("running method 95");
		throw new TooManyListenersException();
		
	}
	public void method96() {
		System.out.println("method 96");
		throw new VerifyError();
	}
	public void method97() {
		System.out.println("method 97");
		throw new UnsatisfiedLinkError();
	}
	public void method98() {
		System.out.println("method 98");
		try {
		method97();
		}catch(UnsatisfiedLinkError e){
			System.out.println("exception handled");
			
		}
		throw new StackOverflowError();
	}
	
	public void method99() throws SQLSyntaxErrorException {
		System.out.println("method 59");
		try {
		method100();
		method95();
		method96();
		}catch(SQLSyntaxErrorException |VerifyError |TooManyListenersException ed) {
			
		System.out.println("3 exception handled");
		}
		throw new NoSuchFieldError("ANU");
		
	}
	
	
	public void method100() throws SQLSyntaxErrorException {
		System.out.println("method 100");
		throw new SQLSyntaxErrorException();

	
}
	
}
