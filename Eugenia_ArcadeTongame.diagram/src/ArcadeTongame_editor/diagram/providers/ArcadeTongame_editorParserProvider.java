package ArcadeTongame_editor.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ArcadeTongame_editorParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser stageName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getStageName_5006Parser() {
		if (stageName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getStage_Name() };
			ArcadeTongame_editor.diagram.parsers.MessageFormatParser parser = new ArcadeTongame_editor.diagram.parsers.MessageFormatParser(
					features);
			stageName_5006Parser = parser;
		}
		return stageName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser wallName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getWallName_5001Parser() {
		if (wallName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getElement_Name() };
			ArcadeTongame_editor.diagram.parsers.MessageFormatParser parser = new ArcadeTongame_editor.diagram.parsers.MessageFormatParser(
					features);
			wallName_5001Parser = parser;
		}
		return wallName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser soundName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getSoundName_5002Parser() {
		if (soundName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getElement_Name() };
			ArcadeTongame_editor.diagram.parsers.MessageFormatParser parser = new ArcadeTongame_editor.diagram.parsers.MessageFormatParser(
					features);
			soundName_5002Parser = parser;
		}
		return soundName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser textName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getTextName_5003Parser() {
		if (textName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getElement_Name() };
			ArcadeTongame_editor.diagram.parsers.MessageFormatParser parser = new ArcadeTongame_editor.diagram.parsers.MessageFormatParser(
					features);
			textName_5003Parser = parser;
		}
		return textName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser inName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getInName_5004Parser() {
		if (inName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getElement_Name() };
			ArcadeTongame_editor.diagram.parsers.MessageFormatParser parser = new ArcadeTongame_editor.diagram.parsers.MessageFormatParser(
					features);
			inName_5004Parser = parser;
		}
		return inName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser outName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getOutName_5005Parser() {
		if (outName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ArcadeTongame_editor.ArcadeTongame_editorPackage.eINSTANCE
					.getElement_Name() };
			ArcadeTongame_editor.diagram.parsers.MessageFormatParser parser = new ArcadeTongame_editor.diagram.parsers.MessageFormatParser(
					features);
			outName_5005Parser = parser;
		}
		return outName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ArcadeTongame_editor.diagram.edit.parts.StageNameEditPart.VISUAL_ID:
			return getStageName_5006Parser();
		case ArcadeTongame_editor.diagram.edit.parts.WallNameEditPart.VISUAL_ID:
			return getWallName_5001Parser();
		case ArcadeTongame_editor.diagram.edit.parts.SoundNameEditPart.VISUAL_ID:
			return getSoundName_5002Parser();
		case ArcadeTongame_editor.diagram.edit.parts.TextNameEditPart.VISUAL_ID:
			return getTextName_5003Parser();
		case ArcadeTongame_editor.diagram.edit.parts.InNameEditPart.VISUAL_ID:
			return getInName_5004Parser();
		case ArcadeTongame_editor.diagram.edit.parts.OutNameEditPart.VISUAL_ID:
			return getOutName_5005Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ArcadeTongame_editor.diagram.part.ArcadeTongame_editorVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ArcadeTongame_editor.diagram.providers.ArcadeTongame_editorElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
