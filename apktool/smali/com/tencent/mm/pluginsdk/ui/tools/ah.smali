.class final Lcom/tencent/mm/pluginsdk/ui/tools/ah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic hfc:Lcom/tencent/mm/pluginsdk/ui/tools/ae$a;


# direct methods
.method constructor <init>(Lcom/tencent/mm/pluginsdk/ui/tools/ae$a;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/tencent/mm/pluginsdk/ui/tools/ah;->hfc:Lcom/tencent/mm/pluginsdk/ui/tools/ae$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/tencent/mm/pluginsdk/ui/tools/ah;->hfc:Lcom/tencent/mm/pluginsdk/ui/tools/ae$a;

    invoke-interface {v0}, Lcom/tencent/mm/pluginsdk/ui/tools/ae$a;->adh()V

    .line 84
    return-void
.end method