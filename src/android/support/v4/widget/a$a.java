package android.support.v4.widget;

import android.database.ContentObserver;
import com.tencent.mm.sdk.platformtools.aa;

final class a$a
  extends ContentObserver
{
  public a$a(a parama)
  {
    super(aa.fetchFreeHandler());
  }
  
  public final boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public final void onChange(boolean paramBoolean)
  {
    hb.onContentChanged();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */