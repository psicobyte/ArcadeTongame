/**
 */
package ArcadeTongame_editor.tests;

import ArcadeTongame_editor.ArcadeTongame_editorFactory;
import ArcadeTongame_editor.Text;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextTest extends OpenerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextTest.class);
	}

	/**
	 * Constructs a new Text test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Text getFixture() {
		return (Text)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ArcadeTongame_editorFactory.eINSTANCE.createText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TextTest
