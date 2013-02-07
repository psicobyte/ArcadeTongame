package figures;



import java.io.File;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;

import org.eclipse.swt.graphics.ImageData;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.util.BundleUtility;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ImageFigure;
import org.osgi.framework.Bundle;


/**
 * @generated
 */
public class Sound extends ImageFigure {

  public Sound()  { 
	  
	  
	  //ImageDescriptor id = ArcadeTongame_editor.diagram.part.ArcadeTongame_editorDiagramEditorPlugin
		//.findImageDescriptor("/Eugenia_ArcadeTongame/src/figures/Sound48.png");

	  
	  //String picturePath = id.toString();
	  
	  
	  
	  
	  
	  
	  //String strClassPath = System.getProperty("java.class.path");
      
      //System.out.println("Classpath is " + strClassPath);
	  
	  
	  //ClassLoader asdf = ClassLoader.getSystemClassLoader();
	  //String picturePath = ClassLoader.getSystemResource("Sound48.png").getFile(); // pay attention to relative path
	  //ImageIcon tmp = new ImageIcon(resource);
	  
      //String picturePath = "Sound48.png";
	  
	  //String picturePath = getClass().getResource("Sound48.png").getPath();
      //String picturePath = "src/figures/Sound48.png";
	  //String picturePath = "bin/figures/Sound48.png";
	  //String picturePath = this.getClass().getClassLoader().getResource("bin/figures/Sound48.png").getPath(); 
	  // URL picturePath2 = this.getClass().getClassLoader().getResource("bin/figures/Sound48.png"); //Standard icon
	  
	  
	  InputStream in = getClass().getResourceAsStream("images/Sound48.png");
	  Image image = new Image(Display.getDefault(), in);
	  
	  
	  //Image image = new Image(null, picturePath);
	  this.setImage(image);
  }


  
}