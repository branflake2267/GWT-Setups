package webapplication.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

public class WebApplication implements EntryPoint {

  @Override
  public void onModuleLoad() {
    HTML works = new HTML("works");
    RootPanel.get().add(works);
  }
  
}
