package com.tencent.mm.c.b;

import android.os.HandlerThread;
import com.tencent.mm.compatible.util.i.a;
import com.tencent.mm.model.ax;
import com.tencent.mm.q.d;
import com.tencent.mm.q.j;
import com.tencent.mm.q.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.aj;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class s
  implements d
{
  private static int aqM = 0;
  Queue aqE = new LinkedList();
  Queue aqF = new LinkedList();
  Map aqG = new HashMap();
  private boolean aqH = false;
  private boolean aqI = false;
  private boolean aqJ = false;
  public int aqK = 0;
  private long aqL = 0L;
  i.a aqN = new i.a();
  private aj aqO = new aj(tdhZl.getLooper(), new v(this), false);
  
  public s()
  {
    ax.tm().a(127, this);
    ax.tm().a(128, this);
  }
  
  private void me()
  {
    aqG.clear();
    aqE.clear();
    aqF.clear();
    aqI = false;
    aqH = false;
    aqJ = false;
    com.tencent.mm.sdk.platformtools.t.d("!44@/B4Tb64lLpJjyqE6YDnAp4yx32s8/BqPmq6RdxNqkkU=", "Finish service use time(ms):" + aqN.pi());
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, j paramj)
  {
    ax.td().k(new t(this, paramj, paramInt1, paramInt2));
  }
  
  public final void run()
  {
    ax.td().k(new u(this));
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.c.b.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */