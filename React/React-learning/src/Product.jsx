function Product({title,price = 2,features}){
    return(
        <div className ="Product">
        <h3>{title}</h3>
        <p>{price}</p>
        <p>{features.map((feature)=> <li>{feature}</li>)}</p>
        </div>
    )
}
export default Product;