package com.microsoft.z3;

public class RecFuncDecl extends FuncDecl {

  RecFuncDecl(Context ctx, long obj)
  {
    super(ctx, obj);

  }

  RecFuncDecl(Context ctx, Symbol name, Sort[] domain, Sort range)

  {
    super(ctx, Native.mkRecFuncDecl(ctx.nCtx(), name.getNativeObject(),
        AST.arrayLength(domain), AST.arrayToNative(domain),
        range.getNativeObject()));

  }

}
